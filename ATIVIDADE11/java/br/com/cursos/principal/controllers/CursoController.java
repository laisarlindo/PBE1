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

import br.com.cursos.principal.entities.Curso;
import br.com.cursos.principal.services.CursoService;


@RestController
@RequestMapping("/curso")
public class CursoController {
	// ATRIBUTOS
			@Autowired
			private CursoService cursoService;


	// MÉTODO
			@PostMapping
			public Curso createCurso(@RequestBody Curso curso) {
			return cursoService.saveCurso(curso);
	}
			@GetMapping
			public List<Curso> getAllCurso() {
			return cursoService.getAllCurso();
	}
			@GetMapping("/{id}")
			public Curso getCurso(@PathVariable Long id) {
				return cursoService.getCursoById(id);

			}
			@DeleteMapping("/{id}")
			public void deleteCurso(@PathVariable Long id) {
				cursoService.deleteCurso(id);
			}
	}


