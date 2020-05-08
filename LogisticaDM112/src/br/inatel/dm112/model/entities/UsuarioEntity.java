package br.inatel.dm112.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioEntity {
	
	@Id
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

    public UsuarioEntity()
    {
    }
	
    public UsuarioEntity(String cpf, String name, String description)
    {
        this.cpf = cpf;
        this.name = name;
        this.email = description;
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String description)
    {
        this.email = description;
    }

    @Override
    public String toString()
    {
        return "EntregadorEntity [cpf=" + cpf + ", name=" + name + ", email=" + email + "]";
    }

}
