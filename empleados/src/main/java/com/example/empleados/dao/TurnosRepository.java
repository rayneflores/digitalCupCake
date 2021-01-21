package com.example.empleados.dao;

import com.example.empleados.dto.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnosRepository extends JpaRepository<Turno, Long> {

    Turno findAllById(Long id);

    Turno findByInicio(Long inicio);

    Turno findByFin(Long fin);

}
