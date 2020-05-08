package br.inatel.dm112.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.dm112.interfaces.Entrega;
import br.inatel.dm112.model.entities.EntregaEntity;
import br.inatel.dm112.services.EntregaService;

@RestController
@RequestMapping ("/api/logistica")
public class EntregaRest implements Entrega
{
    @Autowired
    private EntregaService entregaService;

    @Override
    @GetMapping ("/entrega")
    public List<EntregaEntity> findAll()
    {
        return entregaService.findAll();
    }

    @Override
    @PostMapping ("/entrega")
    public void registrar(@RequestBody EntregaEntity entregaEntity)
    {
        entregaService.registrar(entregaEntity);
    }
    
    @Override
    @GetMapping ("/entrega/{numeroPedido}")
    public EntregaEntity findByNumeroPedido(@PathVariable ("numeroPedido") String numeroPedido)
    {
        return entregaService.findByNumeroPedido(numeroPedido);
    }
}
