package com.locations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locations.model.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Integer> {
	
}
