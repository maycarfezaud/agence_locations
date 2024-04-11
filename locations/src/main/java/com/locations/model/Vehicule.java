package com.locations.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String type;

    @NotNull
    @Min(value = 45, message = "Prix journalier doit être d'au moins 45 €")
    private double prixJournalier;

    @NotNull
    private String couleur;

    @NotNull
    private double poids;

    private int nombrePortes;

    private double longueur; // uniquement pour les camions

    private double cylindre; // uniquement pour les motos et scooters
    
    @OneToMany(mappedBy = "vehicule")
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;
    
}

