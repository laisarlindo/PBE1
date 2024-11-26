package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.senaidev.bancolivraria.entities.Editora;
import com.senaidev.bancolivraria.repositories.EditoraRepository;

@Service
public class EditoraService {
	@Autowired
    private EditoraRepository editoraRepository;
 
	// LISTAR TODOS AS EDITORAS
    public List<Editora> buscarEditoras() {
        return editoraRepository.findAll();
    }
    
    // Buscar editora por ID
    
    public Editora buscarEditorasPorId(Long id) {
        return editoraRepository.findById(id).orElse(null);
    }
   //BUSCA CLIENTE POR CNPJ
    public Editora buscarEditorasPorCnpj(String cnpj) {
    	return editoraRepository.findByCnpj(cnpj);
    }

    // SALVAR EDITORA
    public Editora criarEditora(Editora editora) {
        return editoraRepository.save(editora);
    }

    // Deletar editora
    public void excluirEditora(Long id) {
        editoraRepository.deleteById(id);
    }
}