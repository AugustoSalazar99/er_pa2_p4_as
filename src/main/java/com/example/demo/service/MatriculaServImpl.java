package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMatriculaRep;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServImpl implements IMatriculaServ {

	@Autowired
	private IMatriculaRep matriculaRep;
	@Override
	public void guardar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRep.insertar(matricula);
	}
	
	
	@Override
	public void matricularEstudiante(MatriculaTemp matriculaTemp) {
		// TODO Auto-generated method stub
		Materia materia= new Materia();
		materia.setCodigo(matriculaTemp.getCodigoMateria());
		materia.setNumeroEstudiantes(matriculaTemp.getNumeroEstudiantes()+1);
		Estudiante e= new Estudiante();
		e.setCedula(matriculaTemp.getCedulaEstudiante());
		
		Matricula matr = new Matricula();
		matr.setEstudiante(e);
		matr.setMateria(materia);
		this.matriculaRep.insertar(matr);
	}


	@Override
	public List<MatriculaDTO> reporte() {
		// TODO Auto-generated method stub
		return this.matriculaRep.seleccionarReporte();
	}

}
