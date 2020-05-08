package br.inatel.dm112.model.enities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Entrega")
public class EntregaEntity {
	
	@Id
	@Column(name = "numeroPedido")
	private String numeroPedido;

	@Column(name = "cpfEntrega")
	private String cpfEntrega;

	@Column(name = "description")
	private String description;
	
	@Column(name = "dataEntrega", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrega;

    public EntregaEntity()
    {
    }

    public EntregaEntity(String numeroPedido, String cpfEntrega, String description, Date dataEntrega)
    {
        this.numeroPedido = numeroPedido;
        this.cpfEntrega = cpfEntrega;
        this.description = description;
        this.dataEntrega = dataEntrega;
    }

    public String getNumeroPedido()
    {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido)
    {
        this.numeroPedido = numeroPedido;
    }

    public String getCpfEntrega()
    {
        return cpfEntrega;
    }

    public void setCpfEntrega(String cpfEntrega)
    {
        this.cpfEntrega = cpfEntrega;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getDataEntrega()
    {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega)
    {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString()
    {
        return "EntregaEntity [numeroPedido=" + numeroPedido + ", cpfEntrega=" + cpfEntrega + ", description=" + description + ", dataEntrega=" + dataEntrega + "]";
    }
}
