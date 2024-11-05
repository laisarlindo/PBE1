package br.com.cursos.principal.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursos.principal.entities.Instrutor;
import br.com.cursos.principal.repositories.InstrutorRepository;


	
	@Service
	public class InstrutorService {
		//ATRIBUTOS
		
		@Autowired
		private InstrutorRepository instrutorRepository;
		
		// MÉTODO
			public Instrutor saveInstrutor (Instrutor instrutor) {
				return instrutorRepository.save(instrutor);
			}
			public List<Instrutor> getAllInstrutor() {
				return instrutorRepository.findAll();
			}

			public Instrutor getInstrutorById(Long id) {
				return instrutorRepository.findById(id).orElse(null);
			}

			public void deleteInstrutor(Long id) {
				instrutorRepository.deleteById(id);
			}
		}




