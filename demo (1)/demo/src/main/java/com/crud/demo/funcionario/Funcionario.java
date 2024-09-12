package com.crud.demo.funcionario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double salario;
	private String cargo;
	
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public long getId() {
		return id;
	}

}
