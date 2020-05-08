package br.inatel.dm112.model.enities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Entregador")
public class EntregadorEntity {
	
	@Id
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

    public EntregadorEntity()
    {
    }
	
    public EntregadorEntity(String cpf, String name, String description)
    {
        this.cpf = cpf;
        this.name = name;
        this.description = description;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "EntregadorEntity [cpf=" + cpf + ", name=" + name + ", description=" + description + "]";
    }
}
