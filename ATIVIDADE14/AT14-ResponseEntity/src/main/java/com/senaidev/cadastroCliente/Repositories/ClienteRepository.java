package com.senaidev.cadastroCliente.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroCliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
