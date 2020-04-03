package org.ifa.fbansept.zikos.dao;

import org.ifa.fbansept.zikos.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Integer> {
}
