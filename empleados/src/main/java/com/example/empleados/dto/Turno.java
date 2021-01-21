package com.example.empleados.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Turno implements Serializable {

    private static final long SerialVersionUID = 4894729038597835498L;

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private Long inicio;
    private Long fin;
    private String dias;

    public Turno() {
    }

    public Turno(Long id, String nombre, Long inicio, Long fin, String dias) {
        this.id = id;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.dias = dias;
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

    public Long getInicio() {
        return inicio;
    }

    public void setInicio(Long inicio) {
        this.inicio = inicio;
    }

    public Long getFin() {
        return fin;
    }

    public void setFin(Long fin) {
        this.fin = fin;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", inicio=" + inicio +
                ", fin=" + fin +
                ", dias=" + dias +
                '}';
    }
}
