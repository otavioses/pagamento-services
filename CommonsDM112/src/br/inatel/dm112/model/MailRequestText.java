package br.inatel.dm112.model;

public class MailRequestText {
	private String from;
	private String password;
	private String to;
	private String text;
	private String subject;

	public MailRequestText() {
	}

	public MailRequestText(String from, String password, String to, String text) {
		super();
		this.from = from;
		this.password = password;
		this.to = to;
		this.text = text;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "MailRequestData [from=" + from + ", password=" + password + ", to=" + to + "]";
	}


}
