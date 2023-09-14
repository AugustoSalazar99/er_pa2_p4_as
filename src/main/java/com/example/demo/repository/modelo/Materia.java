package com.example.demo.repository.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="materia")
public class Materia {
	
	
	@GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_materia", sequenceName = "seq_materia")
	
	@Id
	@Column(name="mate_id")
	private Integer id;
	@Column(name="mate_nombre")
	private String nombre;
	@Column(name="mate_codigo")
	private String codigo;
	@Column(name="mate_descripcion")
	private String descripcion;
	@Column(name="mate_numeroCreditos")
	private Integer numeroCreditos;
	@Column(name="mate_numeroEstudiantes")
	private Integer numeroEstudiantes;
	
	
	@OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
	private List<Matricula> matriculas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion
				+ ", numeroCreditos=" + numeroCreditos + ", numeroEstudiantes=" + numeroEstudiantes + "]";
	}
	
	
	//list matricula

	
	
	
	
}
