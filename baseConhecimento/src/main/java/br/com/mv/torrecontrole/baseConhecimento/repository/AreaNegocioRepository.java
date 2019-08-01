package br.com.mv.torrecontrole.baseConhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.torrecontrole.baseConhecimento.model.AreaNegocio;

public interface AreaNegocioRepository extends JpaRepository<AreaNegocio, Long>{

	AreaNegocio findAllById(Long id);

}
