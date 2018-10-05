package com.squadra.blade.services;

import com.squadra.blade.entities.Sistema;
import com.squadra.blade.repositories.SistemaRepository;
import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SistemaService implements ISistemaService {

    @Autowired
    private SistemaRepository _sistemaRepository;

    @Override
    public List<Sistema> listar() {
        return _sistemaRepository.findAll();
    }

    @Override
    @Where(clause = "sigla = 123")
    public List<Sistema> listarPorFiltro() {
        session.
    }

    @Override
    public Sistema criar(Sistema sistema) {
        return  _sistemaRepository.save(sistema);
    }
}
