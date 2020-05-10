package br.inatel.dm112.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.inatel.dm112.model.entities.EntregadorEntity;
import br.inatel.dm112.model.entities.UsuarioEntity;

@Repository
public class UsuarioDAO {
	@Autowired
	private EntityManager entityManager;

	public void create(UsuarioEntity usuarioEntity) {
	    entityManager.getTransaction().begin();
	    entityManager.persist(usuarioEntity);
        entityManager.getTransaction().commit();
	}
	
	public UsuarioEntity findByCpf(String cpf) {
		return entityManager.find(UsuarioEntity.class, cpf);
	}

	public List<UsuarioEntity> findAll() {
		String ql = "select e from UsuarioEntity e";
		
		TypedQuery<UsuarioEntity> q = entityManager.createQuery(ql, UsuarioEntity.class);

		List<UsuarioEntity> usuarios = q.getResultList();
		
		return usuarios;
	}

}
