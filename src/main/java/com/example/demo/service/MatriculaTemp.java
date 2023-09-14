package com.example.demo.service;

public class MatriculaTemp {
	
	private String codigoMateria;
	private String cedulaEstudiante;
	private Integer numeroEstudiantes;
	
	
	public String getCodigoMateria() {
		return codigoMateria;
	}
	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}
	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	@Override
	public String toString() {
		return "MatriculaTemp [codigoMateria=" + codigoMateria + ", cedulaEstudiante=" + cedulaEstudiante
				+ ", numeroEstudiantes=" + numeroEstudiantes + "]";
	}
	
}
