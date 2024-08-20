package com.pelis.pelispractica.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaCategoriaId implements Serializable{

    @Column(name = "id_pelicula")
    private Integer id_pelicula;

    @Column(name = "id_categoria")
    private Integer id_categoria;

    public PeliculaCategoriaId() {
    }

    public Integer getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Integer id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

}
