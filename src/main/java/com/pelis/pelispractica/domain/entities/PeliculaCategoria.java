package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula_categoria")
public class PeliculaCategoria {

    @EmbeddedId
    private PeliculaCategoriaId id;
    
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula peliculas;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categorias;


    public PeliculaCategoria() {
    }

    public PeliculaCategoria(PeliculaCategoriaId id, LocalDateTime ultima_actualizacion, Pelicula peliculas,
            Categoria categorias) {
        this.id = id;
        this.ultima_actualizacion = ultima_actualizacion;
        this.peliculas = peliculas;
        this.categorias = categorias;
    }

    public PeliculaCategoriaId getId() {
        return id;
    }

    public void setId(PeliculaCategoriaId id) {
        this.id = id;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }

    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

  
    

}
