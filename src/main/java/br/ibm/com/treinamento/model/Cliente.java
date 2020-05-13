package br.ibm.com.treinamento.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Table(name = "CLIENTE")
@Inheritance(strategy = InheritanceType.JOINED)// verificado na internet que isso herda da classe pai.
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_cliente")
	//@Column(name = "id_cliente")
	private Long id;
	private String nome;
	private String email;
	private String telefone;
		
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Conta> conta;
	
	public Cliente () {}
	
		public Cliente(Long id, String nome, String email, String telefone, List<Conta> conta) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.conta = conta;
	}
	//gets and sets
	
	public String getNome() {
		return nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public List<Conta> getConta() {
		return conta;
	}
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	

}
