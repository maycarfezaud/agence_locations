package com.locations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locations.model.Agence;
import com.locations.repository.AgenceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    public Agence createAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public Optional<Agence> getAgence(Integer id) {
        return agenceRepository.findById(id);
    }

    public Agence updateAgence(Integer id, Agence agence) {
        Optional<Agence> existingAgenceOptional = agenceRepository.findById(id);
        if (existingAgenceOptional.isPresent()) {
            Agence existingAgence = existingAgenceOptional.get();
            existingAgence.setNom(agence.getNom());
            existingAgence.setAdresse(agence.getAdresse());
            existingAgence.setTelephone(agence.getTelephone());
          
            return agenceRepository.save(existingAgence);
        } else {
        	
            return null;
        }
    }

    public void deleteAgence(Integer id) {
        agenceRepository.deleteById(id);
    }

    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }
}
