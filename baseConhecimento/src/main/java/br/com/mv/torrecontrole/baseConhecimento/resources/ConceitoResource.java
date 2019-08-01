package br.com.mv.torrecontrole.baseConhecimento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.torrecontrole.baseConhecimento.model.Conceito;
import br.com.mv.torrecontrole.baseConhecimento.repository.ConceitoRepository;

@RestController
@RequestMapping(value = "/api")
public class ConceitoResource {
	
	@Autowired
	ConceitoRepository conceitoRepository;
	
	@GetMapping(value = "/listaConceitos")
	public List<Conceito> listaConseitos(){
		return conceitoRepository.findAll();
	}
	
	@GetMapping("/listaConceitos/{id}")
	public Conceito listaConceitoId(@PathVariable(value ="id")long id) {
		return conceitoRepository.findById(id);
	}	
	
	@PostMapping(value = "/conceito")
	public Conceito salvaConceito(@RequestBody Conceito conceito) {
		return conceitoRepository.save(conceito);
	}
	
	@DeleteMapping(value = "/conceito")
	public void deleteConceito(@RequestBody Conceito conceito) {
		conceitoRepository.delete(conceito);
		
	}
	
	@PutMapping(value = "/conceito")
	public Conceito conceito(@RequestBody Conceito conceito) {
		conceitoRepository.save(conceito);
		return conceito;
		
	}
	
	

}
