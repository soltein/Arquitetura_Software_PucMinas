package br.com.popfood.model;

import java.io.Serializable;
import java.util.Date;

import br.com.popfood.configuration.security.UserInterface;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "clientes")
public class Cliente implements Serializable, UserInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7593326319128739946L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 80)
	private String nome;

	@Column(name = "email", nullable = false)
	private String email;	
	
	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;		
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;	
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	public Cliente() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
