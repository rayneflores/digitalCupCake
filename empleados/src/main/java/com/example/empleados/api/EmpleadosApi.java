package com.example.empleados.api;

import com.example.empleados.dto.Empleado;
import com.example.empleados.service.EmpleadoService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmpleadosApi {

    @Autowired
    EmpleadoService empleadoService;

    @Autowired
    Mapper mapper;

    @RequestMapping(value = "/empleados", method = RequestMethod.POST)
    public EmpleadoResponse updateOrSave(@RequestBody @Valid EmpleadoRequest empleadoRequest) {
        Empleado empleado = mapper.map(empleadoRequest, Empleado.class);

        Empleado updatedEmpleado = empleadoService.save(empleado);

        return mapper.map(updatedEmpleado, EmpleadoResponse.class);
    }

    @RequestMapping(value = "/empleados/all", method = RequestMethod.GET)
    public List<Empleado> all(){

        return empleadoService.all();
    }

    @RequestMapping(value = "/empleados/{id}", method = RequestMethod.GET)
    public Empleado getById(@PathVariable(value = "id") Long id ) {

        return empleadoService.findAllById(id);
    }

    @RequestMapping(value = "/empleados/{id}", method = RequestMethod.DELETE)
    public Empleado deleteById(@PathVariable(value = "id") Long id) {
        return empleadoService.deleteById(id);
    }

}
