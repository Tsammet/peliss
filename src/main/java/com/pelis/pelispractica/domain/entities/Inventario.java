package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invantarios")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_inventario;

    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private Pelicula peliculas;

    @ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen almacenes;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Inventario() {
    }

    public Inventario(Integer id_inventario, Pelicula peliculas, Almacen almacenes,
            LocalDateTime ultima_actualizacion) {
        this.id_inventario = id_inventario;
        this.peliculas = peliculas;
        this.almacenes = almacenes;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Integer getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(Integer id_inventario) {
        this.id_inventario = id_inventario;
    }

    public Pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }

    public Almacen getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(Almacen almacenes) {
        this.almacenes = almacenes;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    

}
