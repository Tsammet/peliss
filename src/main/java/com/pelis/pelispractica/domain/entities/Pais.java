package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paises")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_pais;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nombre;
    
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Pais() {
    }

    public Pais(Short id_pais, String nombre, LocalDateTime ultima_actualizacion) {
        this.id_pais = id_pais;
        this.nombre = nombre;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_pais() {
        return id_pais;
    }

    public void setId_pais(Short id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }    

    

}
