package com.fire.academy.api.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB01_BLOQUE", schema = "BDD_FIREACADEMY")
public class Bloque extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Size(max = 1024)
    private String texto;

    @OneToMany(mappedBy = "bloque", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tema> temas;

    public Bloque() {}

    public Bloque(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }


}