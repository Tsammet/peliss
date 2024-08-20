package com.pelis.pelispractica.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaActorId  implements Serializable{

    private Integer id_pelicula;
    private Integer id_actor;

    public PeliculaActorId() {
    }

    public PeliculaActorId(Integer id_pelicula, Integer id_actor) {
        this.id_pelicula = id_pelicula;
        this.id_actor = id_actor;
    }

    public Integer getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Integer id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public Integer getId_actor() {
        return id_actor;
    }

    public void setId_actor(Integer id_actor) {
        this.id_actor = id_actor;
    }

  



}
