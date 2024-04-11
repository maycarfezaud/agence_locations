package com.locations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locations.model.Utilisateur;
import com.locations.repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Optional<Utilisateur> getUtilisateur(Integer id) {
        return utilisateurRepository.findById(id);
    }

    public Utilisateur updateUtilisateur(Integer id, Utilisateur utilisateur) {
        Optional<Utilisateur> existingUserOptional = utilisateurRepository.findById(id);
        if (existingUserOptional.isPresent()) {
            Utilisateur existingUser = existingUserOptional.get();
            existingUser.setPrenom(utilisateur.getPrenom());
            existingUser.setNom(utilisateur.getNom());
            existingUser.setStatut(utilisateur.getStatut());
            existingUser.setLogin(utilisateur.getLogin());
            existingUser.setEmail(utilisateur.getEmail());
            existingUser.setMdp(utilisateur.getMdp());
            
            return utilisateurRepository.save(existingUser);
        } else {
          
            return null;
        }
    }

    public void deleteUtilisateur(Integer id) {
        utilisateurRepository.deleteById(id);
    }

    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}

