package com.senaidev.dorama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.dorama.entities.Personagens;

public interface PersonagensRepository extends JpaRepository<Personagens, Long> {

}