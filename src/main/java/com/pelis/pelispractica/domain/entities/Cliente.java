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
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen almacenes;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombre;
    
    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellidos;
    
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direcciones;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private Short activo;

    @Column(columnDefinition = "DATETIME", nullable = false)
    private Date fecha_creacion;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Cliente() {
    }

    public Cliente(Short id_cliente, Almacen almacenes, String nombre, String apellidos, String email,
            Direccion direcciones, Short activo, Date fecha_creacion, LocalDateTime ultima_actualizacion) {
        this.id_cliente = id_cliente;
        this.almacenes = almacenes;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direcciones = direcciones;
        this.activo = activo;
        this.fecha_creacion = fecha_creacion;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Short id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Almacen getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(Almacen almacenes) {
        this.almacenes = almacenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion direcciones) {
        this.direcciones = direcciones;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    

}
