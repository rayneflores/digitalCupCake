package com.example.empleados.dao;

import com.example.empleados.dto.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosRepository extends JpaRepository<Empleado, Long> {

    Empleado findAllById(Long id);
}
