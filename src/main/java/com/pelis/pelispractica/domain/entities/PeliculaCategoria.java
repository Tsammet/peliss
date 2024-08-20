package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula_categoria")
public class PeliculaCategoria {

    @EmbeddedId
    private PeliculaCategoriaId id;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public PeliculaCategoria() {
    }

    public PeliculaCategoria(PeliculaCategoriaId id, LocalDateTime ultima_actualizacion) {
        this.id = id;
        this.ultima_actualizacion = ultima_actualizacion;
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

    

}
