package com.squadra.blade.services;

import com.squadra.blade.entities.Sistema;

import java.util.List;
import java.util.Optional;

public interface ISistemaService {

    List<Sistema> listar();
    List<Sistema> listarPorFiltro();
    Sistema criar(Sistema sistema);
}
