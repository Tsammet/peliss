package com.pelis.pelispractica.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "actores")
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_actor;

    // @NotNull(message = "blablablabla")
    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombre;
    
    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellidos;
    
    @Embedded
    private Audit audit = new Audit();
    

    public Actor() {
    }    

    public Long getId_actor() {
        return id_actor;
    }    

    public void setId_actor(Long id_actor) {
        this.id_actor = id_actor;
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

    public Audit getAudit() {
        return audit;
    }    

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

}
