package com.elfuturodelsaber.elfuturodelsaber.Estudiante.infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elfuturodelsaber.elfuturodelsaber.Estudiante.application.EstudianteServiceImpl;
import com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.entity.Estudiante;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteServiceImpl estudianteServiceImpl;

    @GetMapping
    public List<Estudiante> listAllEstudents() {
        return estudianteServiceImpl.findAll();
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }

    @PostMapping
    public ResponseEntity<?> createEstudent(@Valid @RequestBody Estudiante estudiante, BindingResult result) {
        if (result.hasErrors()) {
            return validation(result);
        }
        estudianteServiceImpl.save(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body("Estudiante registrado con exito!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEstudent(@PathVariable Long id, @Valid Estudiante updateEstudiante, BindingResult result) {
        if (result.hasErrors()) {
            return validation(result);
        }
        try {
            Optional<Estudiante> existEstudentOptional = estudianteServiceImpl.findById(id);
            if (existEstudentOptional.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estudiante con id: " + id + " no fue encontrado.");
            }
            estudianteServiceImpl.update(id, updateEstudiante);
            return ResponseEntity.ok("Estudiante actualizado correctamente.");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error actualización: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEstudent(@PathVariable Long id) {
        try {
            Optional<Estudiante> estudiante = estudianteServiceImpl.findAll().stream().filter(s -> s.getId().equals(id)).findFirst();
            if (estudiante.isPresent()) {
                estudianteServiceImpl.delete(estudiante.get());
                return ResponseEntity.ok("Estudiante eliminado correctamente.");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estudiante con id:  " + id + " no fue encontrado.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting question: " + e.getMessage());
        }
    }

}
