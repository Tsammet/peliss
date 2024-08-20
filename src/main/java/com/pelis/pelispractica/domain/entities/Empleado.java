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
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_empleado;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombre;
    
    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellidos;
    
    @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direcciones;
    
    @Column(name = "imagen", columnDefinition = "BLOB")
    private byte[] imagen;
    
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen almacenes;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private Short activo;

    @Column(columnDefinition = "VARCHAR(16)", nullable = false)
    private String username;

    @Column(columnDefinition = "VARCHAR(40)", nullable = false)
    private String password;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Empleado() {
    }

    public Empleado(Short id_empleado, String nombre, String apellidos, Direccion direcciones, byte[] imagen,
            String email, Almacen almacenes, Short activo, String username, String password,
            LocalDateTime ultima_actualizacion) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direcciones = direcciones;
        this.imagen = imagen;
        this.email = email;
        this.almacenes = almacenes;
        this.activo = activo;
        this.username = username;
        this.password = password;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Short id_empleado) {
        this.id_empleado = id_empleado;
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

    public Direccion getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion direcciones) {
        this.direcciones = direcciones;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Almacen getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(Almacen almacenes) {
        this.almacenes = almacenes;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    

}
