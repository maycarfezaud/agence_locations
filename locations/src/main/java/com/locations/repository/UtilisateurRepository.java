package com.locations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locations.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
   
}
