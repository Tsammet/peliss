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
@Table(name = "pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_pago;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente clientes;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleados;

    @ManyToOne
    @JoinColumn(name = "id_alquiler")
    private Alquiler alquileres;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = false)
    private Double total;
    
    @Column(columnDefinition = "DATETIME", nullable = false)
    private Date fecha_pago;
        
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Pago() {
    }

    public Pago(Short id_pago, Cliente clientes, Empleado empleados, Alquiler alquileres, Double total, Date fecha_pago,
            LocalDateTime ultima_actualizacion) {
        this.id_pago = id_pago;
        this.clientes = clientes;
        this.empleados = empleados;
        this.alquileres = alquileres;
        this.total = total;
        this.fecha_pago = fecha_pago;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_pago() {
        return id_pago;
    }

    public void setId_pago(Short id_pago) {
        this.id_pago = id_pago;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public Alquiler getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Alquiler alquileres) {
        this.alquileres = alquileres;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

}
