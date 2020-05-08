package br.inatel.dm112.interfaces;

import java.util.List;

import br.inatel.dm112.model.entities.EntregaEntity;

public interface Entrega {
    void registrar(EntregaEntity entregaEntity);
    EntregaEntity findByNumeroPedido(String numeroPedido);
    List<EntregaEntity> findAll();
}