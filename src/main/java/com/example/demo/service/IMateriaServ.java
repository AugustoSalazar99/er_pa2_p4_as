package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaServ {
	
	public void guardar(Materia materia);
	
	public List<Materia> reporteTodo();

}
