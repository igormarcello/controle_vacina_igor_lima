package br.com.opt2.controle_vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.opt2.controle_vacina.domain.Vacina;
import br.com.opt2.controle_vacina.repository.VacinaRepository;

@Service
public class VacinaService {
	@Autowired
	private VacinaRepository vacinaRepository;
	
	public Vacina save(Vacina vacina) {
		return vacinaRepository.save(vacina);
		}

}
