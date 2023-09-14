package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepImpl implements IMatriculaRep {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> seleccionarReporte() {
		// TODO Auto-generated method stub
		TypedQuery<MatriculaDTO> myQuery=this.entityManager.createQuery(
				"SELECT new com.example.demo.repository.modelo.dto.MatriculaDTO("
				+ "ma.estudiante.cedula,ma.estudiante.apellido,ma.materia.nombre,ma.materia.codigo,ma.fechaMatricula)"
				+ "FROM Matricula ma "
				,MatriculaDTO.class);
		
		return myQuery.getResultList();
	}
	
	

}
