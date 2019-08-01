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

import br.com.mv.torrecontrole.baseConhecimento.model.Range;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;

@RestController
@RequestMapping(value = "/api")
public class RangeResource {
	
	@Autowired
	RangeRepository rangeRepository;
	
	@GetMapping("/listRangers")
	public List<Range> listaRange() {
		return rangeRepository.findAll();	 		 
	}
	
	@GetMapping("/listaRangers/{id}")
	public Range listaRangeId(@PathVariable(value = "id")long id) {
		return rangeRepository.findById(id);
		
	}
	
	@PostMapping(value = "/range")
	public Range salvarRange(@RequestBody Range range) {
		return rangeRepository.save(range);
		
	}
	
	@DeleteMapping(value = "/range")
	public void deletaRange(@RequestBody Range range) {
		rangeRepository.delete(range);
		
	}
	
	@PutMapping(value = "/range")
	public void atualizaRange(@RequestBody Range range) {
		rangeRepository.save(range);
		
	}
	
	
	

}
