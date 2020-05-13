package br.ibm.com.treinamento.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name = "CLIENTEPF")
@PrimaryKeyJoinColumn(name = "idPF")
public class ClientePf extends Cliente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String cpf;
	private String dataNascimento;
	private String banco;
	private String dataAdesao;
	
	
	
	//gets and sets

	public ClientePf(Long id, String cpf, String dataNascimento, String banco, 
			String dataAdesao,String nome, String email, String telefone, List<Conta> conta) {
		super(id,nome, email, telefone, conta);
		this.id = id;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.banco = banco;
		this.dataAdesao = dataAdesao;
	}

	public String getCpf() {
		return cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataAdesao() {
		return dataAdesao;
	}
	public void setDataAdesao(String dataAdesao) {
		this.dataAdesao = dataAdesao;
	}
	
	
	
	
	

}
