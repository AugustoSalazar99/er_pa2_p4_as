package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRep;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServImpl implements IEstudianteServ{

	@Autowired
	private IEstudianteRep estudianteRep;
	
	
	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRep.insertar(estudiante);
	}

}
