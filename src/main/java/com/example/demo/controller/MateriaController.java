package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaServ;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	@Autowired
	private IMateriaServ materiaServ;
	
	
	//http://localhost:8081/web/materias/nuevo
	
		//[
		@GetMapping("/nuevo")
		public String pagNuevaMateria(Materia materia) {
			return "vNuevaMateria";
		}
		
		@PostMapping("/guardar")
		public String guardarMateria(Materia materia) {
			this.materiaServ.guardar(materia);
			return "redirect:/materias/reporte";
		}
		
		//]
		
		//[ http://localhost:8081/web/materias/reporte
		@GetMapping("/reporte")
		public String reporteMaterias(Model model) {
			List<Materia> materias=this.materiaServ.reporteTodo();
			model.addAttribute("reporteTodo", materias);
			return "vReporteMateria";
		}
		//]

}
