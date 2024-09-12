package com.crud.demo.funcionario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
	@Autowired
	FuncionarioRepository funcionarioRepositorio;
	  
	public List<Funcionario>  findAll(){
		return funcionarioRepositorio.findAll();
	    }
	
	public Funcionario criar(Funcionario f) {
			return funcionarioRepositorio.save(f);
	}
	public void deletar(Long id) {
		funcionarioRepositorio.deleteById(id);
	}
	public Funcionario update(Long id, Funcionario up) {
		
		Funcionario func = funcionarioRepositorio.findById(id).get();
		func.setCargo(up.getCargo());
		func.setSalario(up.getSalario());

		return funcionarioRepositorio.save(func);
	}
	

	
	
//	public void deletar(Long id) {
		//funcionariorepositorio.deleteById(id);
	//}
}

