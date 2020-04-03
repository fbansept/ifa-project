package org.ifa.fbansept.zikos.model;

import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.ifa.fbansept.zikos.view.MyJsonView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categorie")
@EntityListeners(AuditingEntityListener.class)
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private int id;

    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private String nom;

    @ManyToMany(mappedBy = "listeCategorie", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JsonView({MyJsonView.Categorie.class})
    @Fetch(FetchMode.SUBSELECT)
    private Set<Utilisateur> listeUtilisateur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Utilisateur> getListeUtilisateur() {
       return listeUtilisateur;
    }

    public void setListeUtilisateur(Set<Utilisateur> listeUtilisateur) {
        this.listeUtilisateur = listeUtilisateur;
    }
}
