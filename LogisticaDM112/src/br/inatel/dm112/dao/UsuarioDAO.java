package br.inatel.dm112.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import br.inatel.dm112.model.entities.EntregadorEntity;
import br.inatel.dm112.model.entities.UsuarioEntity;

public class UsuarioDAO {
	@Autowired
	private EntityManager entityManager;

	public void create(UsuarioEntity usuarioEntity) {
	    entityManager.getTransaction().begin();
	    entityManager.persist(usuarioEntity);
        entityManager.getTransaction().commit();
	}
	
	public UsuarioDAO findByCpf(String cpf) {
		return entityManager.find(UsuarioDAO.class, cpf);
	}

	public List<EntregadorEntity> findAll() {
		String ql = "select e from EntregadorEntity e";
		
		TypedQuery<EntregadorEntity> q = entityManager.createQuery(ql, EntregadorEntity.class);

		List<EntregadorEntity> entregadores = q.getResultList();
		
		return entregadores;
	}

}
