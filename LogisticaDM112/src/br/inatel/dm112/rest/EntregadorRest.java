package br.inatel.dm112.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.dm112.interfaces.Entregador;
import br.inatel.dm112.model.enities.EntregadorEntity;
import br.inatel.dm112.services.EntregadorService;

@RestController
@RequestMapping ("/api/logistica")
public class EntregadorRest implements Entregador
{
    @Autowired
    private EntregadorService entregadorService;

    @Override
    @GetMapping ("/entregador")
    public List<EntregadorEntity> findAll()
    {
        return entregadorService.findAll();
    }

    @Override
    @PostMapping ("/entregador")
    public void create(@RequestBody EntregadorEntity entregadorEntity)
    {
       entregadorService.create(entregadorEntity);
    }
    
    @Override
    @GetMapping ("/entregador/{cpf:.+}")
    public EntregadorEntity findByCpf(@PathVariable ("cpf") String cpf)
    {
        return entregadorService.findByCpf(cpf);
    }
}
