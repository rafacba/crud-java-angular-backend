package com.rafa;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Persona {
    
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String nombre;
    
    @Column String apellido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
