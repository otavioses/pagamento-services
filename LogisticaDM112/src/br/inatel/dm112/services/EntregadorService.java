package br.inatel.dm112.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.dm112.dao.EntregadorDAO;
import br.inatel.dm112.model.entities.EntregadorEntity;

@Service
public class EntregadorService {
    
    @Autowired 
    private EntregadorDAO entregadorDAO;
    
    public void create(EntregadorEntity entregadorEntity) {
        entregadorDAO.create(entregadorEntity);
    }
    
    public EntregadorEntity findByCpf(String cpf) {
        return entregadorDAO.findByCpf(cpf);
    }

    public List<EntregadorEntity> findAll() {
        return entregadorDAO.findAll();
    }
}