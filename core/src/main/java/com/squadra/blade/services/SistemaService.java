package com.squadra.blade.services;

import com.squadra.blade.entities.Sistema;
import com.squadra.blade.repositories.SistemaRepository;
import org.hibernate.SessionFactory;
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
    public List<Sistema> listarPorFiltro(String descricao, String sigla, String email) {
        return _sistemaRepository.listarFiltro(descricao, sigla, email);
    }

    @Override
    public Sistema criar(Sistema sistema) {
        sistema.setAtivo(true);
        return  _sistemaRepository.save(sistema);
    }
}
