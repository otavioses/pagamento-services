package br.inatel.dm112.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import br.inatel.dm112.model.entities.EntregadorEntity;

public interface Entregador {
    void create(EntregadorEntity entregadorEntity);
    List<EntregadorEntity> findAll();
    EntregadorEntity findByCpf(@PathVariable("cpf") String cpf);
}