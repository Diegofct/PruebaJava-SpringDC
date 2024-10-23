package com.elfuturodelsaber.elfuturodelsaber.Estudiante.domain.entity;

import java.util.Date;

import com.elfuturodelsaber.elfuturodelsaber.Grado.domain.entity.Grado;
import com.elfuturodelsaber.elfuturodelsaber.TipoDocumento.domain.entity.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstudiante")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idTipoDocumento")
    private TipoDocumento tipoDocumento;

    @Column(name = "numeroIdentidad", columnDefinition = "VARCHAR(15)")
    @NotBlank(message = "El número de identidad no puede estar vacío")
    private String numeroIdentidad;

    @Column(name = "nombres", columnDefinition = "VARCHAR(50)")
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombres;

    @Column(name = "apellidos", columnDefinition = "VARCHAR(50)")
    @NotBlank(message = "El apellido no puede estar vacío")
    private String apellidos;

    @Column(name="fechaNacimiento", columnDefinition="DATE")
    private Date fechaNacimiento;

    @Column(name = "edad")
    private int edad;

    @ManyToOne
    @JoinColumn(name = "idGrado")
    private Grado gradoActual;

    @Column(name = "email")
    private String email;

    @Column(name = "telefonoFijo")
    private String telefonoFijo;

    @Column(name = "numeroCelular")
    private String celular;

    public Estudiante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Grado getGradoActual() {
        return gradoActual;
    }

    public void setGradoActual(Grado gradoActual) {
        this.gradoActual = gradoActual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

}
