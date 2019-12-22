package br.com.paulotolentino.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulotolentino.cursomc.domain.Categoria;
import br.com.paulotolentino.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria Buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id) ;
		
		return obj.orElse(null);
		
	}

}
