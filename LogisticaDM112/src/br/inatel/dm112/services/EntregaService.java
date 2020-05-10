package br.inatel.dm112.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.dm112.client.EmailClient;
import br.inatel.dm112.client.PedidoClient;
import br.inatel.dm112.dao.EntregaDAO;
import br.inatel.dm112.dao.UsuarioDAO;
import br.inatel.dm112.model.MailStatusResponse;
import br.inatel.dm112.model.OrderResponse;
import br.inatel.dm112.model.entities.EntregaEntity;
import br.inatel.dm112.model.entities.UsuarioEntity;
import br.inatel.dm112.rest.support.UserNotFoundException;

@Service
public class EntregaService {
    
    @Autowired 
    private EntregaDAO entregaDAO;
    
    @Autowired 
    private UsuarioDAO usuarioDAO;
    
    
    private EmailClient clientEmail = new EmailClient();
    private PedidoClient pedidoClient = new PedidoClient();
    
    public void registrar(EntregaEntity entregaEntity) {
 
        entregaDAO.registrar(entregaEntity);
        
        OrderResponse orderResponse = pedidoClient.searchOrder(entregaEntity.getNumeroPedido());
        
        UsuarioEntity usuario = usuarioDAO.findByCpf(orderResponse.getCpf());
        
        if (usuario == null) {
        	throw new UserNotFoundException("Usuário não encontrado");
        }
        
        String emailSubject = entregaEntity.getDescription();
        
        String emailText = 
        		"Olá " + usuario.getName() + "!" +
        		"\nSeu pedido número: " + entregaEntity.getNumeroPedido() + 
        		" foi entregue com sucesso na data: " + entregaEntity.getDataEntrega() + "," +
        		"\nfoi recebido por CPF: " + entregaEntity.getCpfEntrega();
        
        String to = usuario.getEmail();
        		
        
        MailStatusResponse result = clientEmail.callSendTextMailService(
				"robertorr9@gmail.com", "robertodm112", to, emailSubject, emailText);
    }
    
    public EntregaEntity findByNumeroPedido(String numeroPedido) {
        return entregaDAO.findByNumeroPedido(numeroPedido);
    }

    public List<EntregaEntity> findAll() {
        return entregaDAO.findAll();
    }
}