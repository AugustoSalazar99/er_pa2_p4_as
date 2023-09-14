package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaServ {
	
	public void guardar(Matricula matricula);
	
	public void matricularEstudiante(MatriculaTemp matriculaTemp);

	public List<MatriculaDTO> reporte();
}
