package br.com.cursos.principal.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.cursos.principal.entities.Turma;
import br.com.cursos.principal.repositories.TurmaRepository;

public class TurmaService {
	//ATRIBUTOS
	
			@Autowired
			private TurmaRepository turmaRepository;
			
			// MÉTODO
				public Turma saveTurma (Turma turma) {
					return turmaRepository.save(turma);
				}
				public List<Turma> getAllTurma() {
					return turmaRepository.findAll();
				}

				public Turma getTurmaById(Long id) {
					return turmaRepository.findById(id).orElse(null);
				}

				public void deleteTurma(Long id) {
					turmaRepository.deleteById(id);
				}
			}



