package br.inatel.dm112.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.inatel.dm112.model.enities.EntregadorEntity;

@Repository
public class EntregadorDAO {

	@Autowired
	private EntityManager entityManager;

	public void create(EntregadorEntity entregadorEntity) {
	    entityManager.getTransaction().begin();
	    entityManager.persist(entregadorEntity);
        entityManager.getTransaction().commit();
	}
	
	public EntregadorEntity findByCpf(String cpf) {
		return entityManager.find(EntregadorEntity.class, cpf);
	}

	public List<EntregadorEntity> findAll() {
		String ql = "select e from EntregadorEntity e";
		
		TypedQuery<EntregadorEntity> q = entityManager.createQuery(ql, EntregadorEntity.class);

		List<EntregadorEntity> entregadores = q.getResultList();
		
		return entregadores;
	}
}
