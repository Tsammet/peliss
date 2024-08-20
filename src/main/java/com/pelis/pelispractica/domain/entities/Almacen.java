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
@Table(name = "almacenes")
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_almacen;

    @ManyToOne
    @JoinColumn(name = "id_empleado_jefe")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direcciones;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Almacen() {
    }

    public Almacen(Short id_almacen, Empleado empleado, Direccion direcciones, LocalDateTime ultima_actualizacion) {
        this.id_almacen = id_almacen;
        this.empleado = empleado;
        this.direcciones = direcciones;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(Short id_almacen) {
        this.id_almacen = id_almacen;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Direccion getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion direcciones) {
        this.direcciones = direcciones;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    

    
}
