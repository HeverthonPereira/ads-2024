package com.crud.demo.funcionario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
	
	
	@Autowired
	FuncionarioService funcionarioservice;
	
	
	@GetMapping("/lista")
	public List <Funcionario> lista(){
		return funcionarioservice.findAll();
	}
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Funcionario dados) {
		funcionarioservice.criar(dados);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		funcionarioservice.deletar(id);
	}
	@PutMapping("/update")
	public void update(@PathVariable Long id ,Funcionario funcionario) {
		funcionarioservice.update(id, funcionario);
	}
	
	
}
