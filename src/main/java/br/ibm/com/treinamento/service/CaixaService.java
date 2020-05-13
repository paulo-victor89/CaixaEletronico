package br.ibm.com.treinamento.service;



import org.springframework.stereotype.Service;

import br.ibm.com.treinamento.model.ClientePf;
import br.ibm.com.treinamento.model.ClientePj;
import br.ibm.com.treinamento.model.Hora;

@Service
public interface CaixaService {

	Object criaNovoClientePf(ClientePf novoClientePf);
	
	Object atualizaClientePf(ClientePf atualizaClientePf);

	Object criaNovoClientePj(ClientePj novoClientePj);

	Object atualizaClientePj(ClientePj atualizaClientePj);

	Object pesquisaContaPf(String nome);

	Object mostraHora(Hora hora);

	
	
	
	
}
