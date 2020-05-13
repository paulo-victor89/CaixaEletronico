package br.ibm.com.treinamento.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name = "CLIENTEPJ")
@PrimaryKeyJoinColumn(name = "idPJ")
public class ClientePj extends Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String cnpj;
	private String dataAbertura;
	private String banco;
	private String dataAdesao;

	public String getCnpj() {
		return cnpj;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataAdesao() {
		return dataAdesao;
	}

	public void setDataAdesao(String dataAdesao) {
		this.dataAdesao = dataAdesao;
	}
	
	
	
	

}
