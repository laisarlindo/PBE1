package com.senaidev.dorama.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.dorama.entities.Dorama;
public interface DoramaRepository extends JpaRepository<Dorama, Long> {

}