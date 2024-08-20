package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "idiomas")
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_idioma;
    
    @Column(columnDefinition = "Char(20)", nullable = false)
    private String nombre;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Idioma() {
    }

    public Idioma(Short id_idioma, String nombre, LocalDateTime ultima_actualizacion) {
        this.id_idioma = id_idioma;
        this.nombre = nombre;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_idioma() {
        return id_idioma;
    }

    public void setId_idioma(Short id_idioma) {
        this.id_idioma = id_idioma;
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
