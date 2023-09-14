package com.example.demo.repository.modelo.dto;

import java.time.LocalDate;

public class MatriculaDTO {
	
	private String cedulaEstudiante;
	private String apellidoEstudiante;
	private String nombreMateria;
	private String codigoMateria;
	private LocalDate fechaMatricula;
	
	
	public MatriculaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}


	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}


	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}


	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}


	public String getNombreMateria() {
		return nombreMateria;
	}


	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}


	public String getCodigoMateria() {
		return codigoMateria;
	}


	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}


	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}


	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}


	@Override
	public String toString() {
		return "MatriculaDTO [cedulaEstudiante=" + cedulaEstudiante + ", apellidoEstudiante=" + apellidoEstudiante
				+ ", nombreMateria=" + nombreMateria + ", codigoMateria=" + codigoMateria + ", fechaMatricula="
				+ fechaMatricula + "]";
	}


	

	
	
	
	

}
