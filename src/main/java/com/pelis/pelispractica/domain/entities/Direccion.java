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
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_direccion;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String direccion;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String direccion2;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String distrito;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudades;
    
    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    private String codigo_postal;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String telefono;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Direccion() {
    }

    public Direccion(Short id_direccion, String direccion, String direccion2, String distrito, Ciudad ciudades,
        String codigo_postal, String telefono, LocalDateTime ultima_actualizacion) {
        this.id_direccion = id_direccion;
        this.direccion = direccion;
        this.direccion2 = direccion2;
        this.distrito = distrito;
        this.ciudades = ciudades;
        this.codigo_postal = codigo_postal;
        this.telefono = telefono;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Short id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Ciudad getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad ciudades) {
        this.ciudades = ciudades;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    
}
