package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteServ;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	@Autowired
	private IEstudianteServ estudianteServ;
	
	//http://localhost:8081/web/estudiantes/nuevo
	
	//[
	@GetMapping("/nuevo")
	public String pagNuevoEstudiante(Estudiante estudiante) {
		return "vNuevoEstudiante";
	}
	
	@PostMapping("/guardar")
	public String guardarEstudiante(Estudiante estudiante) {
		this.estudianteServ.guardar(estudiante);
		return "redirect:/estudiantes/nuevo";
	}
	
	//]
	
	//[
	
	
	
	//]
	
	

}
