package com.squadra.blade.entities;

import javax.persistence.*;

@Entity
@Table(name = "Sistema")
public class Sistema {

    @Id
    @GeneratedValue
    private long id;
    private String descricao;
    private String sigla;
    private String email;

    public String get_sigla() {
        return sigla;
    }

    public void set_sigla(String sigla) {
        this.sigla = sigla;
    }

    public long get_id() {
        return id;
    }

    public void set_id(long id) {
        this.id = id;
    }

    public String get_descricao() {
        return descricao;
    }

    public void set_descricao(String descricao) {
        this.descricao = descricao;
    }

    public String get_email() {
        return email;
    }

    public void set_email(String email) {
        this.email = email;
    }
}
