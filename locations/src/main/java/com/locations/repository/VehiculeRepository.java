package com.locations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locations.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {
   
}

