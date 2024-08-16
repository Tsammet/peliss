package com.pelis.pelispractica.domain.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actores")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_actor;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombre;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellido;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private Date ultima_actualizacion;

    public Actor() {
    }

    public Long getId_actor() {
        return id_actor;
    }

    public void setId_actor(Long id_actor) {
        this.id_actor = id_actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(Date ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

}
