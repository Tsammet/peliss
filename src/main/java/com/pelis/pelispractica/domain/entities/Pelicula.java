package com.pelis.pelispractica.domain.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pelicula;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descripcion;

    @Column(columnDefinition = "YEAR", nullable = false)
    private Date anyo_lanzamiento;
    
    // @ManyToOne
    // @JoinTable(name = "id_idioma")
    // private Idioma idiomas;

    // @ManyToOne
    // @JoinTable(name = "id_idioma_original")
    // private Idioma id_idioma;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private int duracion_alquiler;

    @Column(columnDefinition = "DECIMAL(4,2)", nullable = false)
    private double rental_rate;

    @Column(columnDefinition = "SMALLINT", nullable = false)
    private int duracion;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = false)
    private Long replacement_cost;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private Date ultima_actualizacion;

    public Pelicula() {
    }

    public Long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getAnyo_lanzamiento() {
        return anyo_lanzamiento;
    }

    public void setAnyo_lanzamiento(Date anyo_lanzamiento) {
        this.anyo_lanzamiento = anyo_lanzamiento;
    }

    // public Idioma getIdiomas() {
    //     return idiomas;
    // }

    // public void setIdiomas(Idioma idiomas) {
    //     this.idiomas = idiomas;
    // }

    public int getDuracion_alquiler() {
        return duracion_alquiler;
    }

    public void setDuracion_alquiler(int duracion_alquiler) {
        this.duracion_alquiler = duracion_alquiler;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Long getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Long replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Date getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(Date ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }


}
