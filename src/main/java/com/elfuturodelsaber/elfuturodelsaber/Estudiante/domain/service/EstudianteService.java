package com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.service;

import java.util.List;
import java.util.Optional;

import com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.entity.Estudiante;

public interface EstudianteService {

    void save(Estudiante estudiante);
    void delete(Estudiante estudiante);
    void update(Long id, Estudiante estudiante);
    List<Estudiante> findAll();
    Optional<Estudiante> findById(Long id);
}
