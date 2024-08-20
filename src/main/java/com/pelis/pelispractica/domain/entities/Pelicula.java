package com.pelis.pelispractica.domain.entities;

import java.time.LocalDateTime;
import java.time.Year;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {
    

    public enum Clasificacion {
        G,
        PG,
        PG_13,
        R,
        NC_17
    }
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Short id_pelicula;

    @Column(columnDefinition = "VARCHAR(255)", nullable= false)
    private String titulo;
    
    @Column(columnDefinition = "TEXT", nullable= false)
    private String descripcion;
    
    @Column(columnDefinition = "YEAR", nullable= false)
    private Year agnio_lanzamiento;
    
    @ManyToOne
    @JoinColumn(name = "id_idioma")
    private Idioma id_idioma;
    
    @ManyToOne
    @JoinColumn(name = "id_idioma_original")
    private Idioma id_idioma_original;
    
    @Column(columnDefinition = "TINYINT", nullable= false)
    private Short duracion_alquiler;
    
    @Column(columnDefinition = "DECIMAL(4,2)", nullable= false)
    private Double rental_date;
    
    @Column(columnDefinition = "SMALLINT", nullable= false)
    private Short duracion;
    
    @Column(columnDefinition = "DECIMAL(5,2)", nullable= false)
    private Double replacement_cost;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Clasificacion clasificacion;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Pelicula() {
    }

    public Pelicula(Short id_pelicula, String titulo, String descripcion, Year agnio_lanzamiento, Idioma id_idioma,
            Idioma id_idioma_original, Short duracion_alquiler, Double rental_date, Short duracion,
            Double replacement_cost, Clasificacion clasificacion, LocalDateTime ultima_actualizacion) {
        this.id_pelicula = id_pelicula;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.agnio_lanzamiento = agnio_lanzamiento;
        this.id_idioma = id_idioma;
        this.id_idioma_original = id_idioma_original;
        this.duracion_alquiler = duracion_alquiler;
        this.rental_date = rental_date;
        this.duracion = duracion;
        this.replacement_cost = replacement_cost;
        this.clasificacion = clasificacion;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Short id_pelicula) {
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

    public Year getAgnio_lanzamiento() {
        return agnio_lanzamiento;
    }

    public void setAgnio_lanzamiento(Year agnio_lanzamiento) {
        this.agnio_lanzamiento = agnio_lanzamiento;
    }

    public Idioma getId_idioma() {
        return id_idioma;
    }

    public void setId_idioma(Idioma id_idioma) {
        this.id_idioma = id_idioma;
    }

    public Idioma getId_idioma_original() {
        return id_idioma_original;
    }

    public void setId_idioma_original(Idioma id_idioma_original) {
        this.id_idioma_original = id_idioma_original;
    }

    public Short getDuracion_alquiler() {
        return duracion_alquiler;
    }

    public void setDuracion_alquiler(Short duracion_alquiler) {
        this.duracion_alquiler = duracion_alquiler;
    }

    public Double getRental_date() {
        return rental_date;
    }

    public void setRental_date(Double rental_date) {
        this.rental_date = rental_date;
    }

    public Short getDuracion() {
        return duracion;
    }

    public void setDuracion(Short duracion) {
        this.duracion = duracion;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    
    
}
