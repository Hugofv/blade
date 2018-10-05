package com.squadra.blade.controllers;

import com.squadra.blade.entities.Sistema;
import com.squadra.blade.services.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/sistema")
public class SistemaController {

    @Autowired
    SistemaService _sistemaService;

    @GetMapping
    public ResponseEntity<?> listar() {
        List<Sistema> sistemas =_sistemaService.listar();
        return new ResponseEntity(sistemas, HttpStatus.ACCEPTED);
    }

    @GetMapping("/filtro")
    public ResponseEntity<?> listarPorFiltro(@RequestParam("descricao") String descricao, @RequestParam("sigla") String sigla, @RequestParam("email") String email) {
        List<Sistema> sistemas = _sistemaService.listarPorFiltro();
        return new ResponseEntity(sistemas, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody Sistema sistema) {
        _sistemaService.criar(sistema);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
