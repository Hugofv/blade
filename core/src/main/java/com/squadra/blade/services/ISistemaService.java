package com.squadra.blade.services;

import com.squadra.blade.entities.Sistema;

import java.util.List;

public interface ISistemaService {
    List<Sistema> listarPorFiltro(String descricao, String sigla, String email);
    Sistema criar(Sistema sistema);
}
