package br.inatel.dm112.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.dm112.interfaces.Email;
import br.inatel.dm112.model.MailRequestData;
import br.inatel.dm112.model.MailRequestText;
import br.inatel.dm112.model.MailStatusResponse;
import br.inatel.dm112.service.MailService;

@RestController
@RequestMapping(value = "/api")
public class MailRest implements Email {

	@Autowired
	private MailService service;

	@Override
	@PostMapping(value = "/sendMail")
	public MailStatusResponse sendMail(@RequestBody MailRequestData mailData) {

		System.out.println("MailRest - sendMail");
		return service.sendMail(mailData);
	}
	
	@Override
	@PostMapping(value = "/sendTextMail")
	public MailStatusResponse sendMail(@RequestBody MailRequestText mailData) {

		System.out.println("MailRest - sendTextMail");
		return service.sendTextMail(mailData);
	}

}