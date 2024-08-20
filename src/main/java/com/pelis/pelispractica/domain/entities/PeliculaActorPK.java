package com.pelis.pelispractica.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaActorPK  implements Serializable{

    @Column(name = "id_pelicula")
    private Short idpelicula;

    @Column(name = "id_actor")
    private Short idactor;

    public PeliculaActorPK() {
    }

    public Short getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(Short idpelicula) {
        this.idpelicula = idpelicula;
    }

    public Short getIdactor() {
        return idactor;
    }

    public void setIdactor(Short idactor) {
        this.idactor = idactor;
    }


}
