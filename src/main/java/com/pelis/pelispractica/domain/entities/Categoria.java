package com.pelis.pelispractica.domain.entities;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;

    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    private String nombre;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Categoria() {
    }

    public Categoria(Integer id_categoria, String nombre, LocalDateTime ultima_actualizacion) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
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
