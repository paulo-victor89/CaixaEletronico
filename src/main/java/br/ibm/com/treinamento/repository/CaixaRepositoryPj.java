package br.ibm.com.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ibm.com.treinamento.model.ClientePj;

@Repository
public interface CaixaRepositoryPj extends JpaRepository<ClientePj, Long>{

}
