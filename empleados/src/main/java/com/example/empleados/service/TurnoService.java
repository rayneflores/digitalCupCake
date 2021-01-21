package com.example.empleados.service;

import com.example.empleados.dao.TurnosRepository;
import com.example.empleados.dto.Turno;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TurnoService {

    @Autowired
    TurnosRepository dao;

    public Turno save(Turno turno) {
        return dao.saveAndFlush(turno);
    }

    public List<Turno> all() {
        return dao.findAll();
    }

    public Turno findByInicio(Long inicio) {
        return dao.findByInicio(inicio);
    }

    public Turno findByFin(Long fin) {
        return dao.findByFin(fin);
    }
}
