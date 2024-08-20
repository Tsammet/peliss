package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula_actor")
public class PeliculaActor {

    @EmbeddedId
    PeliculaActorPK id;


    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;
    
    @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula peliculas;

    @ManyToOne
    @JoinColumn(name = "id_actor", insertable = false, updatable = false)
    private Actor actores;

    public PeliculaActor() {
    }

    public PeliculaActorPK getId() {
        return id;
    }

    public void setId(PeliculaActorPK id) {
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

    public Actor getActores() {
        return actores;
    }

    public void setActores(Actor actores) {
        this.actores = actores;
    }

    
    
}
