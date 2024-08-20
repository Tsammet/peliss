package com.pelis.pelispractica.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaCategoriaId implements Serializable{

    private Integer id_pelicula;
    private Integer id_categoria;
    public PeliculaCategoriaId() {
    }
    public PeliculaCategoriaId(Integer id_pelicula, Integer id_categoria) {
        this.id_pelicula = id_pelicula;
        this.id_categoria = id_categoria;
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
