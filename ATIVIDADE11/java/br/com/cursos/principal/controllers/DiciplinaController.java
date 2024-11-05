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


import br.com.cursos.principal.entities.Diciplina;

import br.com.cursos.principal.services.DiciplinaService;

@RestController
@RequestMapping("/diciplina")
public class DiciplinaController {
	// ATRIBUTOS
		@Autowired
		private DiciplinaService diciplinaService;
		
		// MÉTODO
			@PostMapping
			public Diciplina createDiciplina(@RequestBody Diciplina diciplina) {
			return diciplinaService.saveDiciplina(diciplina);
			}
			@GetMapping
			public List<Diciplina> getAllDiciplina() {
			return diciplinaService.getAllDiciplina();
	}
			@GetMapping("/{id}")
			public Diciplina getDiciplina(@PathVariable Long id) {
				return diciplinaService.getDiciplinaById(id);
}
			@DeleteMapping("/{id}")
			public void deleteDiciplina(@PathVariable Long id) {
				diciplinaService.deleteDiciplina(id);
			}
}
