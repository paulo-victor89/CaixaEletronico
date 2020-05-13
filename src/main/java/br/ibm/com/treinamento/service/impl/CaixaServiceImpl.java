package br.ibm.com.treinamento.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.ibm.com.treinamento.exception.ObjetoInexistenteException;
import br.ibm.com.treinamento.model.ClientePf;
import br.ibm.com.treinamento.model.ClientePj;
import br.ibm.com.treinamento.model.Hora;
import br.ibm.com.treinamento.repository.CaixaRepositoryPf;
import br.ibm.com.treinamento.repository.CaixaRepositoryPj;
import br.ibm.com.treinamento.service.CaixaService;


@Service
public abstract class CaixaServiceImpl implements CaixaService{

	
	@Autowired
	private CaixaRepositoryPf caixaRespositoryPf;
	
	@Autowired
	private CaixaRepositoryPj caixaRepositoryPj;
	
	@Override
	public Object criaNovoClientePf(ClientePf novoClientePf) {
		caixaRespositoryPf.save(novoClientePf);
			
		return novoClientePf;
	}

	@Override
	public Object criaNovoClientePj(ClientePj novoClientePj) {
		caixaRepositoryPj.save(novoClientePj);
		return novoClientePj;
			
	}
	
	@Override
	public Object atualizaClientePf(ClientePf atualizaClientePf) {
		caixaRespositoryPf.save(atualizaClientePf);
		  
		  return "Cliente PF atualizado";
		
	}

	@Override
	public Object atualizaClientePj(ClientePj atualizaClientePj) {
		caixaRepositoryPj.save(atualizaClientePj);
		  
		  return "Cliente PJ atualizado";
	}

	@Override
	public Object pesquisaContaPf(String  nome) {
		
		Optional<ClientePf> clientePf = caixaRespositoryPf.findByNome(nome);
        if(!clientePf.isPresent())
            throw new ObjetoInexistenteException("Cliente com o Nome " + nome + " não encontrado");
            
        return clientePf.get();
    }

	@Override
	public Object mostraHora(Hora hora) {
		
		return null;
	}
	

	
	
	
	


}
