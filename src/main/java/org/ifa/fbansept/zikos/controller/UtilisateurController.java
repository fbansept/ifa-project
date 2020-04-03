package org.ifa.fbansept.zikos.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.ifa.fbansept.zikos.dao.UtilisateurDao;
import org.ifa.fbansept.zikos.model.Categorie;
import org.ifa.fbansept.zikos.model.Pays;
import org.ifa.fbansept.zikos.model.Utilisateur;
import org.ifa.fbansept.zikos.view.MyJsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class UtilisateurController {

    private static final String PERSISTENCE_UNIT_NAME = "Utilisateur";
    UtilisateurDao utilisateurDao;

    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    public UtilisateurController(UtilisateurDao utilisateurDao){
        this.utilisateurDao = utilisateurDao;
    }

    @GetMapping("/utilisateurs")
    @JsonView(MyJsonView.Utilisateur.class)
    public List<Utilisateur> getUtilisateurs(){
        List<Utilisateur> test = utilisateurDao.findAll();
        System.out.println("----------------------");
        return test;
    }

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable int id){
        return utilisateurDao.findById(id).orElse(null);
    }

    @PutMapping("/utilisateurs")
    public String saveUtilisateur(@RequestBody Utilisateur utilisateur){

        //Pays pays = entityManager.getReference(Pays.class, utilisateur.);

        Utilisateur user = utilisateurDao.save(utilisateur);
        return "Spring c'est coollll !!!";
    }


}
