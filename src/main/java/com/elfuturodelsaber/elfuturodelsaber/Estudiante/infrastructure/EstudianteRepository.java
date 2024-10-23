package com.elfuturodelsaber.elfuturodelsaber.Estudiante.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{

}
