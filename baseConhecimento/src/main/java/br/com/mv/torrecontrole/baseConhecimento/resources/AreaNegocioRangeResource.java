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

import br.com.mv.torrecontrole.baseConhecimento.dto.DiagnosticoAreaNegocioDto;
import br.com.mv.torrecontrole.baseConhecimento.model.AreaNegocioRange;
import br.com.mv.torrecontrole.baseConhecimento.repository.AreaNegocioRangeRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.AreaNegocioRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;
import br.com.mv.torrecontrole.baseConhecimento.resources.form.DiagnosticoAreaNegocioForm;

@RestController
@RequestMapping(value = "/api")
public class AreaNegocioRangeResource {
	
	@Autowired
	AreaNegocioRangeRepository areaNegocioRangeRepository;
	
	@Autowired
	AreaNegocioRepository areaNegocioRepository;
	
	@Autowired
	RangeRepository rangeRepository;
	
	

	@GetMapping(value = "/listaDiagArea")
	public List<DiagnosticoAreaNegocioDto> listarDiagAreaNegocio(){
		
		return DiagnosticoAreaNegocioDto.convert(areaNegocioRangeRepository.findAll());
	}
	
	@PostMapping("/diagArea")
	public ResponseEntity<DiagnosticoAreaNegocioDto>  cadastrar(@RequestBody DiagnosticoAreaNegocioForm areaNegocioForm, UriComponentsBuilder uriBuilder) {
		System.out.println("Log Controller AreaNegocioRangeResource"+areaNegocioForm.toString());
		AreaNegocioRange areaNegocioRange = areaNegocioForm.convert(areaNegocioRepository, rangeRepository);
		areaNegocioRangeRepository.save(areaNegocioRange);
		URI uri = uriBuilder.path("/diagConceito/{id}").buildAndExpand(areaNegocioRange.getAreaNegocio().getId()).toUri();
		return ResponseEntity.created(uri).body(new DiagnosticoAreaNegocioDto());

	}

}
