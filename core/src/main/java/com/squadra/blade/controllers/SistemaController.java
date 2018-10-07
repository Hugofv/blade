package com.squadra.blade.controllers;

import com.squadra.blade.entities.Sistema;
import com.squadra.blade.services.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController("/sistema")
public class SistemaController {

    @Autowired
    SistemaService _sistemaService;

    @GetMapping("/filtro")
    public ResponseEntity<?> listarPorFiltro(@RequestParam(value = "descricao", defaultValue = "") String descricao,
                                             @RequestParam(value = "sigla", defaultValue = "") String sigla,
                                             @RequestParam(value = "email", defaultValue = "") String email) {
        List<Sistema> sistemas = _sistemaService.listarPorFiltro(descricao, sigla, email);
        return new ResponseEntity(sistemas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody Sistema sistema) {
        _sistemaService.criar(sistema);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
