package com.example.demo.repository.modelo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="matricula")
public class Matricula {
	
	@GeneratedValue(generator = "seq_matricula", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_matricula", sequenceName = "seq_matricula")

	@Id
	@Column(name="matri_id")
	private Integer id;
	@Column(name="matri_referenciaMateria")
	private String referenciaMateria;
	@Column(name="matri_referenciaEstudiante")
	private String referenciaEstudiante;
	@Column(name="matri_fechaMatricula")
	private LocalDate fechaMatricula;
	
	@ManyToOne
	@JoinColumn(name ="matri_id_materia")
	private Materia materia;
		
	@ManyToOne
	@JoinColumn(name ="matri_id_estudiante")
	private Estudiante estudiante;



	
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReferenciaMateria() {
		return referenciaMateria;
	}
	public void setReferenciaMateria(String referenciaMateria) {
		this.referenciaMateria = referenciaMateria;
	}
	public String getReferenciaEstudiante() {
		return referenciaEstudiante;
	}
	public void setReferenciaEstudiante(String referenciaEstudiante) {
		this.referenciaEstudiante = referenciaEstudiante;
	}
	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	@Override
	public String toString() {
		return "Matricula [id=" + id + ", referenciaMateria=" + referenciaMateria + ", referenciaEstudiante="
				+ referenciaEstudiante + ", fechaMatricula=" + fechaMatricula + "]";
	}
	
	
}
