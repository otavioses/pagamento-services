package br.inatel.dm112.model;

public class OrderResponse {

	private int status;
	private int number;
	private String cpf;
	private String value;
	private Long orderDate;
	private Long issueDate;
	private Long paymentDate;
	

	public OrderResponse() {

	}

	public OrderResponse(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
	

	public int getNumber() {
		return number;
	}

	public String getCpf() {
		return cpf;
	}

	public String getValue() {
		return value;
	}

	public Long getOrderDate() {
		return orderDate;
	}

	public Long getIssueDate() {
		return issueDate;
	}

	public Long getPaymentDate() {
		return paymentDate;
	}

	@Override
	public String toString() {
		return "OrderResponse [status=" + status + "]";
	}
	
}
