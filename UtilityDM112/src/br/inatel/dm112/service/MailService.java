package br.inatel.dm112.service;

import org.springframework.stereotype.Service;

import br.inatel.dm112.adapter.MailAdapter;
import br.inatel.dm112.model.MailRequestData;
import br.inatel.dm112.model.MailRequestText;
import br.inatel.dm112.model.MailStatusResponse;

@Service
public class MailService {

	public MailStatusResponse sendMail(MailRequestData mailData) {
		if (mailData.getFrom() == null || 
				mailData.getPassword() == null || 
				mailData.getTo() == null || 
				mailData.getContent() == null) {
			return new MailStatusResponse(MailStatusResponse.STATUS.ERROR.ordinal(), 
					mailData.getFrom(), mailData.getTo(), "Null values not allowed in MailRequestData.");
		}

		MailAdapter sender = new MailAdapter();
		try {
			sender.sendMail(mailData.getFrom(), mailData.getPassword(), mailData.getTo(), mailData.getContent());
		} catch(Exception e) {
			e.printStackTrace();
			return new MailStatusResponse(MailStatusResponse.STATUS.ERROR.ordinal(), 
					mailData.getFrom(), mailData.getTo(), e.getMessage());
		}
		return new MailStatusResponse(MailStatusResponse.STATUS.OK.ordinal(), 
				mailData.getFrom(), mailData.getTo(), "Email sent success.");
	}
	
	public MailStatusResponse sendTextMail(MailRequestText mailData) {
		if (mailData.getFrom() == null || 
				mailData.getPassword() == null || 
				mailData.getTo() == null || 
				mailData.getText() == null) {
			return new MailStatusResponse(MailStatusResponse.STATUS.ERROR.ordinal(), 
					mailData.getFrom(), mailData.getTo(), "Null values not allowed in MailRequestData.");
		}

		MailAdapter sender = new MailAdapter();
		try {
			sender.sendTextMail(mailData.getFrom(), mailData.getPassword(), mailData.getTo(), mailData.getSubject(), mailData.getText());
		} catch(Exception e) {
			e.printStackTrace();
			return new MailStatusResponse(MailStatusResponse.STATUS.ERROR.ordinal(), 
					mailData.getFrom(), mailData.getTo(), e.getMessage());
		}
		return new MailStatusResponse(MailStatusResponse.STATUS.OK.ordinal(), 
				mailData.getFrom(), mailData.getTo(), "Email sent success.");
	}

}