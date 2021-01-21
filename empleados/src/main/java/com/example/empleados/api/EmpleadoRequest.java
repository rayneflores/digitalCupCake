package com.example.empleados.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmpleadoRequest {

    private Long id;
    @NotNull(message = "Se Requiere un Nombre")
    @Size(min = 2, max = 30, message = "El Nombre debe tener entre {min} y {max} caracteres")
    private String nombre;
    @NotNull(message = "Se Requiere un Apellido")
    @Size(min = 2, max = 30, message = "El Apellido debe tener entre {min} y {max} caracteres")
    private String apellido;
    private Long turno;

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
}
