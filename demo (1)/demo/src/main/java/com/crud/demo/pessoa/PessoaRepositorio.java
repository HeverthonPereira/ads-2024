package com.crud.demo.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorio extends JpaRepository<PessoaEntidade, Long>  {

}
