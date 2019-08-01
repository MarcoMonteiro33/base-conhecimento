package br.com.mv.torrecontrole.baseConhecimento.resources;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.mv.torrecontrole.baseConhecimento.dto.DiagnosticoConceitoDto;
import br.com.mv.torrecontrole.baseConhecimento.model.ConceitoRange;
import br.com.mv.torrecontrole.baseConhecimento.repository.ConceitoRangeRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.ConceitoRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;
import br.com.mv.torrecontrole.baseConhecimento.resources.form.DiagnosticoConceitoForm;

@RestController
@RequestMapping(value = "/api")
public class ConceitoRangeResource {	
	
	@Autowired
	ConceitoRangeRepository conceitoRangeRepository;
	
	@Autowired
	ConceitoRepository conceitoRepository;
	
	@Autowired
	RangeRepository rangeRepository;
	

	@GetMapping(value = "/listaDiagConceito")
	public List<DiagnosticoConceitoDto> listDiagConceito(String melhoria){
		if(melhoria == null) {
			return DiagnosticoConceitoDto.converte(conceitoRangeRepository.findAll()); 
		}else {
			return DiagnosticoConceitoDto.converte(conceitoRangeRepository.findByConceitoNome(melhoria));
		}
		
	}
	
	@GetMapping("/pesqName")
	public List<DiagnosticoConceitoDto> pesqParteNome(String texto){	
		System.out.println(texto);
		return DiagnosticoConceitoDto.converte(conceitoRangeRepository.pesquisarParteNome(texto));
	}
	
	@PostMapping("/diagConceito")
	public ResponseEntity<DiagnosticoConceitoDto> cadastrar(@RequestBody DiagnosticoConceitoForm diagnosticoConceitoForm, UriComponentsBuilder uriBuilder) {
		ConceitoRange conceitoRange = diagnosticoConceitoForm.convert(conceitoRepository, rangeRepository);		
		System.out.println(conceitoRange.toString());
		conceitoRangeRepository.save(conceitoRange);
		
		URI uri = uriBuilder.path("/diagConceito/{id}").buildAndExpand(conceitoRange.getConceito().getId()).toUri();
	   return ResponseEntity.created(uri).body(new DiagnosticoConceitoDto());
	}
	

}
