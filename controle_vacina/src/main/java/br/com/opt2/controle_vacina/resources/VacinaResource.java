package br.com.opt2.controle_vacina.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.opt2.controle_vacina.domain.Vacina;
import br.com.opt2.controle_vacina.service.VacinaService;

@RestController
@RequestMapping("/api/v1/vacinas")
public class VacinaResource {
	@Autowired
	private VacinaService vacinaService;
	
	@PostMapping
	public Vacina save(@RequestBody Vacina vacina){
	return vacinaService.save(vacina);
	}
}