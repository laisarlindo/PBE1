package com.senaidev.bancolivraria.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Cliente;
import com.senaidev.bancolivraria.repositories.ClienteRepository;

@Service
public class ClienteService {
	 @Autowired
	    private ClienteRepository clienteRepository;
	 
	// LISTAR TODOS OS CLIENTES
	    public List<Cliente> buscarClientes() {
	        return clienteRepository.findAll();
	    }
	    
	 // Buscar cliente por ID
	    public Cliente buscarClientesPorId(Long id) {
	        return clienteRepository.findById(id).orElse(null);
	    }
	    //BUSCA CLIENTE POR CPF
	    public Cliente buscarClientesPorCpf(String cpf) {
	    	return clienteRepository.findByCpf(cpf);
	    }

	    // Salvar cliente
	    public Cliente criarCliente(Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

	    // Deletar cliente
	    public void excluirCliente(Long id) {
	        clienteRepository.deleteById(id);
	    }
	}