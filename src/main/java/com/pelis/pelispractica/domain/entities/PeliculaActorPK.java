package com.pelis.pelispractica.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaActorPK  implements Serializable{

    @Column(name = "id_pelicula")
    private Long idpelicula;

    @Column(name = "id_actor")
    private Long idactor;

    public PeliculaActorPK() {
    }

    public Long getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(Long idpelicula) {
        this.idpelicula = idpelicula;
    }

    public Long getIdactor() {
        return idactor;
    }

    public void setIdactor(Long idactor) {
        this.idactor = idactor;
    }


}
