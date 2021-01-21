package com.example.empleados.api;

import java.time.temporal.WeekFields;
import java.util.List;

public class TurnoResponse {

    private Long id;
    private String nombre;
    private Long inicio;
    private Long fin;
    private List<WeekFields> dias;

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

    public List<WeekFields> getDias() {
        return dias;
    }

    public void setDias(List<WeekFields> dias) {
        this.dias = dias;
    }
}
