package com.example.empleados.service;

import com.example.empleados.dao.EmpleadosRepository;
import com.example.empleados.dto.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadosRepository dao;

    public Empleado save(Empleado empleado) {
        return dao.saveAndFlush(empleado);
    }

    public Empleado findAllById(Long id) {
        return dao.findAllById(id);
    }

    public List<Empleado> all() {
        return dao.findAll();
    }

    public Empleado deleteById(Long id) {
        dao.deleteById(id);
        return null;
    }


}
