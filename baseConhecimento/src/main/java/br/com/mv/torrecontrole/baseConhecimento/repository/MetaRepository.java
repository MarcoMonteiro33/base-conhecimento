package br.com.mv.torrecontrole.baseConhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.torrecontrole.baseConhecimento.model.Meta;

public interface MetaRepository extends JpaRepository<Meta, Long>{
	
	Meta findById(long id);

}
