package com.elfuturodelsaber.elfuturodelsaber.Estudiante.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.entity.Estudiante;
import com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.service.EstudianteService;
import com.elfuturodelsaber.elfuturodelsaber.Estudiante.infrastructure.EstudianteRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    @Transactional
    public void save(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(Estudiante estudiante) {
       estudianteRepository.delete(estudiante);
    }

    @Override
    @Transactional
    public void update(Long id, Estudiante estudiante) {
        Optional<Estudiante> existingEstudiante = estudianteRepository.findById(estudiante.getId());

        if (existingEstudiante.isPresent()) {
            Estudiante foundEstudiante = existingEstudiante.get();

            foundEstudiante.setTipoDocumento(estudiante.getTipoDocumento());
            foundEstudiante.setNumeroIdentidad(estudiante.getNumeroIdentidad());
            foundEstudiante.setNombres(estudiante.getNombres());
            foundEstudiante.setApellidos(estudiante.getApellidos());
            foundEstudiante.setFechaNacimiento(estudiante.getFechaNacimiento());
            foundEstudiante.setEdad(estudiante.getEdad());
            foundEstudiante.setGradoActual(estudiante.getGradoActual());
            foundEstudiante.setEmail(estudiante.getEmail());
            foundEstudiante.setTelefonoFijo(estudiante.getTelefonoFijo());
            foundEstudiante.setCelular(estudiante.getCelular());

            estudianteRepository.save(estudiante);
        } else {
            throw new EntityNotFoundException("Estudiante con id: " + id + " no se encontró.");
        }
    }

    @Override
    @Transactional
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Estudiante> findById(Long id) {
        return estudianteRepository.findById(id);
    }

}
