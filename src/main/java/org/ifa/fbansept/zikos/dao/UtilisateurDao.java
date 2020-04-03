package org.ifa.fbansept.zikos.dao;

import org.ifa.fbansept.zikos.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findByNom(String nom);
}
