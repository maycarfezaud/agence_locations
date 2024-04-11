package com.locations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locations.model.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
	
}

