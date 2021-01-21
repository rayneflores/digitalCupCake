package com.example.empleados.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Empleado implements Serializable {

    private static final long SerialVersionUID = 4894729030347835498L;

    @Id
    @GeneratedValue
    Long id;
    String nombre;
    String apellido;
    Long turno;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, Long turno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getTurno() {
        return turno;
    }

    public void setTurno(Long turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", turno=" + turno +
                '}';
    }
}
