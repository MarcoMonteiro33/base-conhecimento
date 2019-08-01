package br.com.mv.torrecontrole.baseConhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.torrecontrole.baseConhecimento.model.Conceito;

public interface ConceitoRepository extends JpaRepository<Conceito, Long>{
	
	Conceito findById(long id);
	
}
