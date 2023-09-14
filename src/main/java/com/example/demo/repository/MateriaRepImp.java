package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MateriaRepImp implements IMateriaRep{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Materia> seleccionarTodo() {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery =this.entityManager.createQuery(
				"SELECT m FROM Materia m"
				,Materia.class);
		return myQuery.getResultList();
	}
}
