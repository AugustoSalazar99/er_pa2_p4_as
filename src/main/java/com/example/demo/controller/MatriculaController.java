package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;
import com.example.demo.service.IMatriculaServ;
import com.example.demo.service.MatriculaTemp;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private IMatriculaServ matriculaServ;
	
	//insertar[ http://localhost:8081/web/matriculas/nuevo
	@GetMapping("/nuevo")
	public String pagNuevaMatricula(MatriculaTemp matriculaTemp) {
		return "vGuardarMatricula";
	}
	@PostMapping("/guarda")
	public String nuevaMatricula(MatriculaTemp matriculaTemp) {
		this.matriculaServ.matricularEstudiante(matriculaTemp);
		return "redirect:/matriculas/nuevo";
	}
	
	//]
	
	//[
	
	// http://localhost:8081/web/matriculas/reporte
	@GetMapping("/reporte")
	public String reporteEstudiante(MatriculaDTO matriculaDTO, Model model) {
		List<MatriculaDTO> matriEst=this.matriculaServ.reporte();
		model.addAttribute("reporteEst",matriEst);
		return "vReporteMatricula";
	}
	//]
	
	

}
