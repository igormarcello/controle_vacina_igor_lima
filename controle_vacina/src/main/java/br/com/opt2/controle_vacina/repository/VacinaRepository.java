package br.com.opt2.controle_vacina.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.opt2.controle_vacina.domain.Vacina;

@Repository
public interface VacinaRepository extends CrudRepository<Vacina, Long>{
}