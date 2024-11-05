package br.com.cursos.principal.services;

	import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursos.principal.entities.Diciplina;
import br.com.cursos.principal.repositories.DiciplinaRepository;


	
		@Service
		public class DiciplinaService {
			//ATRIBUTOS
			
			@Autowired
			private DiciplinaRepository diciplinaRepository;
			
			// MÉTODO
				public Diciplina saveDiciplina (Diciplina diciplina) {
					return diciplinaRepository.save(diciplina);
				}
				public List<Diciplina> getAllDiciplina() {
					return diciplinaRepository.findAll();
				}

				public Diciplina getDiciplinaById(Long id) {
					return diciplinaRepository.findById(id).orElse(null);
				}

				public void deleteDiciplina(Long id) {
					diciplinaRepository.deleteById(id);
				}
			}

	



