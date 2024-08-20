package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula_actor")
public class PeliculaActor {

    @EmbeddedId
    private PeliculaActorId id;


    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public PeliculaActor() {
    }

    public PeliculaActor(PeliculaActorId id, LocalDateTime ultima_actualizacion) {
        this.id = id;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public PeliculaActorId getId() {
        return id;
    }

    public void setId(PeliculaActorId id) {
        this.id = id;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    
}
