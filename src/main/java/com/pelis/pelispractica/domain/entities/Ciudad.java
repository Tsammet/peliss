package com.pelis.pelispractica.domain.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ciudad;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais paises;
    
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private Date ultima_actualizacion;

    public Ciudad() {
    }

    public Long getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Long id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPaises() {
        return paises;
    }

    public void setPaises(Pais paises) {
        this.paises = paises;
    }

    public Date getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(Date ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }


}
