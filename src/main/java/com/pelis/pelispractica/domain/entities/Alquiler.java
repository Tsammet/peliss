package com.pelis.pelispractica.domain.entities;

import java.sql.Date;
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
@Table(name = "alquileres")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_alquiler;

    @Column(columnDefinition = "DATETIME", nullable = false)
    private Date fecha_alquiler;

    @ManyToOne
    @JoinColumn(name = "id_inventario")
    private Inventario inventarios;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente clientes;

    @Column(columnDefinition = "DATETIME", nullable = false)
    private Date fecha_devolucion;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleados;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Alquiler() {
    }

    public Alquiler(Integer id_alquiler, Date fecha_alquiler, Inventario inventarios, Cliente clientes,
            Date fecha_devolucion, Empleado empleados, LocalDateTime ultima_actualizacion) {
        this.id_alquiler = id_alquiler;
        this.fecha_alquiler = fecha_alquiler;
        this.inventarios = inventarios;
        this.clientes = clientes;
        this.fecha_devolucion = fecha_devolucion;
        this.empleados = empleados;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Integer getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(Integer id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Date fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public Inventario getInventarios() {
        return inventarios;
    }

    public void setInventarios(Inventario inventarios) {
        this.inventarios = inventarios;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    
}
