package br.ibm.com.treinamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.ibm.com.treinamento.exception.InternalException;
import br.ibm.com.treinamento.exception.ObjetoInexistenteException;
import br.ibm.com.treinamento.exception.Resposta;
import br.ibm.com.treinamento.model.ClientePf;
import br.ibm.com.treinamento.model.ClientePj;
import br.ibm.com.treinamento.model.Hora;
import br.ibm.com.treinamento.service.CaixaService;
@RestController
@RequestMapping("/")
public class CaixaController {
	
	
	@Autowired
	private CaixaService CS;
	
	//Cadastro de cliente
			
	@PostMapping("caixa/cliente/novo/Pf")
	public ResponseEntity<Object>criaClientePf(@RequestBody ClientePf novoClientePf){
		try {
			return ResponseEntity.ok(CS.criaNovoClientePf(novoClientePf));
			
		}catch(InternalException ie) {
			 
			return ResponseEntity.badRequest().body(new Resposta(ie.getCode(), ie.getMessage(), null));
		}
	}
	
	@PostMapping("caixa/cliente/novo/Pj")
	public ResponseEntity<Object>criaClientePj (@RequestBody ClientePj novoClientePj){
		try {
			return ResponseEntity.ok(CS.criaNovoClientePj(novoClientePj));
			
		}catch(InternalException ie) {
			 
			return ResponseEntity.badRequest().body(new Resposta(ie.getCode(), ie.getMessage(), null));
		}
		//alterar dados de um cliente pf		
	}
	@PostMapping("caixa/hora")
	public ResponseEntity<Object>hora (@RequestBody Hora hora){
		try {
			return ResponseEntity.ok(CS.mostraHora(hora));
			
		}catch(InternalException ie) {
			 
			return ResponseEntity.badRequest().body(new Resposta(ie.getCode(), ie.getMessage(), null));
		}
		//alterar dados de um cliente pf		
	}
	@PutMapping("caixa/cliente/atualiza/Pf")
	public ResponseEntity<Object>atualizaClientePf (@RequestBody ClientePf atualizaClientePf){
		try {
			return ResponseEntity.ok(CS.atualizaClientePf(atualizaClientePf));
			
		}catch(InternalException ie) {
			 
			return ResponseEntity.badRequest().body(new Resposta(ie.getCode(), ie.getMessage(), null));
		}

	}
	
	@PutMapping("caixa/cliente/atualiza/Pj")
	public ResponseEntity<Object>atualizaClientePj(@RequestBody ClientePj atualizaClientePj){
		try {
			return ResponseEntity.ok(CS.atualizaClientePj(atualizaClientePj));
			
		}catch(InternalException ie) {
			 
			return ResponseEntity.badRequest().body(new Resposta(ie.getCode(), ie.getMessage(), null));
		}
	}
	
	@GetMapping("caixa/cliente/busca/Pf/{nome}")
	public ResponseEntity<Object> buscaClienteConta(@PathVariable(value = "nome") String nome) {
		try {
			return ResponseEntity.ok(CS.pesquisaContaPf(nome));
		} catch (ObjetoInexistenteException e) {
			return ResponseEntity.badRequest().body(new Resposta(e.getCode(), e.getLocalizedMessage(), null));
		}

	}
}
	

	
	
	



