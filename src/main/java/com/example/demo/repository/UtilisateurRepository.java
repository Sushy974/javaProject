package com.example.demo.repository;

import com.example.demo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // Recherche d'un utilisateur par son username
    Utilisateur findByUsername(String username);
    
    // Recherche d'utilisateurs par leur nom
    List<Utilisateur> findByNom(String nom);

}

