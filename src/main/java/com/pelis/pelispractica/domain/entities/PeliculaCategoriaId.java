package com.pelis.pelispractica.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaCategoriaId implements Serializable{

    @Column(name = "id_pelicula")
    private Long id_pelicula;

    @Column(name = "id_categoria")
    private Long id_categoria;

    public PeliculaCategoriaId() {
    }

    public Long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

}
