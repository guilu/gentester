package com.fire.academy.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "TB02_TEMA", schema = "BDD_FIREACADEMY")
public class Tema extends BaseEntity {

    private static final Logger LOG = LoggerFactory.getLogger(Tema.class);

    private static final long serialVersionUID = 2L;

    @ManyToOne
    @JoinColumn(name = "BLOQUE_ID", referencedColumnName = "ID")
    @JsonIgnore
    private Bloque bloque;

    @Size(max = 1024)
    private String texto;

    @OneToMany(mappedBy = "tema", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pregunta> preguntas;

    public Bloque getBloque() {
        return bloque;
    }

    public void setBloque(Bloque bloque) {
        this.bloque = bloque;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public int getNumPreguntas() {
        return (this.preguntas != null) ? this.preguntas.size() : 0;
    }

    /**
     * Tiene preguntas...
     * @return boolean
     */
    public boolean hasPreguntas() {
        return (this.getPreguntas().size() > 0);
    }
}
