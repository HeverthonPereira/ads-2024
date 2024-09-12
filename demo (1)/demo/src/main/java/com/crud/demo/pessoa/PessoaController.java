package com.crud.demo.pessoa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List <PessoaEntidade> findAll(){
		return pessoaService.findAll();
	}
	
	@PostMapping
	public PessoaEntidade criar( @RequestBody PessoaEntidade entidade) {
		return pessoaService.criar(entidade);
		
	}
	
	@DeleteMapping
	("/{id}")
    private void  deletarEndereco(@PathVariable Long id){
        pessoaService.deletar(id);
		}
	
	}
