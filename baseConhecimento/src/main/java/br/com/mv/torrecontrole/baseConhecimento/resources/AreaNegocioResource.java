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

import br.com.mv.torrecontrole.baseConhecimento.model.AreaNegocio;
import br.com.mv.torrecontrole.baseConhecimento.repository.AreaNegocioRepository;

@RestController
@RequestMapping(value = "/api")
public class AreaNegocioResource {
	
	@Autowired
	AreaNegocioRepository areaNegocioRepository;
	
	@GetMapping(value = "/listaAreaNegocio")
	public List<AreaNegocio> listarTodos(){		
		return areaNegocioRepository.findAll();
	}
	
	@GetMapping(value = "/listaAreaNegocio/{id}")
	public AreaNegocio listaAreaNegocioId(@PathVariable (value = "id")Long id) {		
		return areaNegocioRepository.findAllById(id);
	}
	
	@PostMapping(value = "/areaNegocio")
	public AreaNegocio salvaAreaNegocio(@RequestBody AreaNegocio areaNegocio) {
		return areaNegocioRepository.save(areaNegocio);
		
	}
	
	@DeleteMapping(value = "/areaNegocio")
	public void deletarAreaNegocio(@RequestBody AreaNegocio areaNegocio) {
		areaNegocioRepository.delete(areaNegocio);
	}

	@PutMapping(value = "/areaNegocio")	
	public AreaNegocio atualizaAreaNegocio(@RequestBody AreaNegocio areaNegocio) {
		return areaNegocioRepository.save(areaNegocio);
	}
}
