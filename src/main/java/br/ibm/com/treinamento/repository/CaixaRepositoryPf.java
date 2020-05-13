package br.ibm.com.treinamento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ibm.com.treinamento.model.Cliente;
import br.ibm.com.treinamento.model.ClientePf;

@Repository
public interface CaixaRepositoryPf extends JpaRepository<ClientePf, Long>{

	Optional<ClientePf> findByNome(String nome);

}
