package br.inatel.dm112.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.dm112.dao.EntregaDAO;
import br.inatel.dm112.model.enities.EntregaEntity;

@Service
public class EntregaService {
    
    @Autowired 
    private EntregaDAO entregaDAO;
    
    public void registrar(EntregaEntity entregaEntity) {
        entregaDAO.registrar(entregaEntity);
    }
    
    public EntregaEntity findByNumeroPedido(String numeroPedido) {
        return entregaDAO.findByNumeroPedido(numeroPedido);
    }

    public List<EntregaEntity> findAll() {
        return entregaDAO.findAll();
    }
}