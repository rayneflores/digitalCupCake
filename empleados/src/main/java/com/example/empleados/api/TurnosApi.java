package com.example.empleados.api;

import com.example.empleados.dto.Turno;
import com.example.empleados.service.TurnoService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class TurnosApi {

    @Autowired
    TurnoService turnoService;

    @Autowired
    Mapper mapper;

    @RequestMapping(value = "/turnos/all", method = RequestMethod.GET)
    public List<Turno> all() {

        return turnoService.all();
    }

}
