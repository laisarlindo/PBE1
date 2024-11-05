package br.com.cursos.principal.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursos.principal.entities.Turma;
import br.com.cursos.principal.services.TurmaService;

@RestController
@RequestMapping("/turma")

public class TurmaController {
	// ATRIBUTOS
			@Autowired
			private TurmaService turmaService;
			
			// MÉTODO
			@PostMapping
			public Turma createTurma(@RequestBody Turma turma) {
			return turmaService.saveTurma(turma);
			}
			
			@GetMapping
			public List<Turma> getAllTurma() {
			return turmaService.getAllTurma();
			
			
}
			@GetMapping("/{id}")
			public Turma getTurma(@PathVariable Long id) {
			return turmaService.getTurmaById(id);		
			
	}
			@DeleteMapping("/{id}")
			public void deleteTurma(@PathVariable Long id) {
				turmaService.deleteTurma(id);
			}

}
