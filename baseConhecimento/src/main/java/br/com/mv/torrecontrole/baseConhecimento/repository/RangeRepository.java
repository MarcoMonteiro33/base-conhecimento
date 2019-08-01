package br.com.mv.torrecontrole.baseConhecimento.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.torrecontrole.baseConhecimento.model.Range;

public interface RangeRepository extends JpaRepository<Range, Long>{
	
	Range findById(long id); 

}
