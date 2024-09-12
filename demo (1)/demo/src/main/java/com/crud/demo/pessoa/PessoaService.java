package com.crud.demo.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaService { 
	
	@Autowired
	public PessoaRepositorio pessoaRepositorio;
	
	
	public List <PessoaEntidade> findAll(){
		return pessoaRepositorio.findAll();
	}
	
	public PessoaEntidade criar(PessoaEntidade entidade) {
		return pessoaRepositorio.save(entidade);
	
	}
	public void deletar(Long id) {
		pessoaRepositorio.deleteById(id);
	}
}


