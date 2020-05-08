package br.inatel.dm112.client;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.dm112.model.MailRequestData;
import br.inatel.dm112.model.MailRequestText;
import br.inatel.dm112.model.MailStatusResponse;
import reactor.core.publisher.Mono;

public class EmailClient {

	// local
	private String restURL = "http://localhost:8080/UtilityDM112/api/";

	//TODO: modificar este email para enviar para outro endereço
	private static String sendTo = "otavio.ses@gmail.com";
	
	public MailStatusResponse callSendTextMailService(String from, String password, String to, String subject, String text ) {

		String url = restURL + "sendTextMail";
		
		MailRequestText mrd = new MailRequestText(from, password, to, subject,text);
		
		return WebClient
				.create(url)
		        .post()
		        .contentType(MediaType.APPLICATION_JSON)
		        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
		        .body(Mono.just(mrd), MailRequestData.class)
		        .accept(MediaType.APPLICATION_JSON)
		        .retrieve()
		        .bodyToFlux(MailStatusResponse.class)
		        .log()
		        .blockFirst();
	}

	public static void main(String[] args) {
		try {

			EmailClient client = new EmailClient();
			
			MailStatusResponse result = client.callSendTextMailService(
					"robertorr9@gmail.com", "robertodm112", sendTo, "Assunto","Texto");
			
			System.out.println("Resposta do email: " + result.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
