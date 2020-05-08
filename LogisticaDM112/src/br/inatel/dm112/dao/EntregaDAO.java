package br.inatel.dm112.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.inatel.dm112.model.entities.EntregaEntity;

@Repository
public class EntregaDAO {

	@Autowired
	private EntityManager entityManager;

	public void registrar(EntregaEntity entregaEntity) {
	    entityManager.getTransaction().begin();
	    entityManager.persist(entregaEntity);
        entityManager.getTransaction().commit();
	}
	
	public EntregaEntity findByNumeroPedido(String numeroPedido) {
		return entityManager.find(EntregaEntity.class, numeroPedido);
	}

	public List<EntregaEntity> findAll() {
		String ql = "select e from EntregaEntity e";
		
		TypedQuery<EntregaEntity> q = entityManager.createQuery(ql, EntregaEntity.class);

		List<EntregaEntity> entregas = q.getResultList();
		
		return entregas;
	}
}
