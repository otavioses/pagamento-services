package br.inatel.dm112.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.dm112.client.EmailClient;
import br.inatel.dm112.dao.EntregaDAO;
import br.inatel.dm112.model.MailStatusResponse;
import br.inatel.dm112.model.entities.EntregaEntity;

@Service
public class EntregaService {
    
    @Autowired 
    private EntregaDAO entregaDAO;
    
    private EmailClient clientEmail = new EmailClient();
    
    public void registrar(EntregaEntity entregaEntity) {
 
        entregaDAO.registrar(entregaEntity);
        
        String emailSubject = entregaEntity.getDescription();
        
        String emailText = 
        		"Pedido número: " + entregaEntity.getNumeroPedido() + "," +
        		"\nentregue com sucesso na data: " + entregaEntity.getDataEntrega() + "," +
        		"\nRecebido por CPF: " + entregaEntity.getCpfEntrega();
        String to = "otavio.ses@gmail.com";
        		
        
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