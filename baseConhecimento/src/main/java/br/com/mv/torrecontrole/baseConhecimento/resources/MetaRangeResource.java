package br.com.mv.torrecontrole.baseConhecimento.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.mv.torrecontrole.baseConhecimento.dto.MetaRangeDto;
import br.com.mv.torrecontrole.baseConhecimento.model.MetaRange;
import br.com.mv.torrecontrole.baseConhecimento.repository.MetaRangeRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.MetaRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;
import br.com.mv.torrecontrole.baseConhecimento.resources.form.DiagnosticoMetaForm;

@RestController
@RequestMapping(value = "/api")
public class MetaRangeResource {
	
	@Autowired
	MetaRangeRepository metaRangeRepository;
	
	@Autowired
	MetaRepository metaRepository;
	
	@Autowired
	RangeRepository rangeRepository;
	
	@GetMapping(value = "/listaMeta")
	public List<MetaRangeDto> listarDiagMeta(){
	  List<MetaRange> metaRanges =metaRangeRepository.findAll();
	  return MetaRangeDto.convert(metaRanges);
	}
	
	@PostMapping("/diagMeta")
	public ResponseEntity<MetaRangeDto>  cadastrar(@RequestBody @Valid DiagnosticoMetaForm diagnosticoMetaForm, UriComponentsBuilder uriComponentsBuilder ) {
		MetaRange metaRange = diagnosticoMetaForm.convert(metaRepository, rangeRepository);
		metaRangeRepository.save(metaRange);
		URI uri = uriComponentsBuilder.path("/diagConceito/{id}").buildAndExpand(metaRange.getMeta().getId()).toUri();
		return ResponseEntity.created(uri).body(new MetaRangeDto());
	}
	
	

}
