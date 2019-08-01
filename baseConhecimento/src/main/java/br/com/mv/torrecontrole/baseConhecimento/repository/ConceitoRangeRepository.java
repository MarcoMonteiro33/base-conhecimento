package br.com.mv.torrecontrole.baseConhecimento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.mv.torrecontrole.baseConhecimento.model.ConceitoRange;

public interface ConceitoRangeRepository extends JpaRepository<ConceitoRange, Long>{
	
	List<ConceitoRange> findByConceitoNome(String melhoria);
	
	@Query("SELECT CR.conceito.nome, CR.analiseAtual FROM Conceito C , ConceitoRange CR WHERE C.id = CR.conceito.id and CR.conceito.nome  LIKE '%:texto%' ")
	List<ConceitoRange> pesquisarParteNome(@Param("texto") String texto);

}
