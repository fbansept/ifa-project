package org.ifa.fbansept.zikos.model;

import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.ifa.fbansept.zikos.view.MyJsonView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "utilisateur")
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur {

    public Utilisateur() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private int id;

    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private String prenom;

    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private String nom;

    private String password;

    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private boolean estHomme;

    @Enumerated(EnumType.STRING)
    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    @Column(columnDefinition = "ENUM('ADMIN', 'MODERATEUR', 'UTILISATEUR')")
    private Droit droit;

    @JsonView({MyJsonView.Utilisateur.class, MyJsonView.Categorie.class})
    private String urlImage;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JsonView({MyJsonView.Utilisateur.class})
    @Fetch(FetchMode.SUBSELECT)
    private Set<Categorie> listeCategorie;

    @ManyToOne
    @JoinColumn(name = "id_pays")
    private Pays pays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstHomme() {
        return estHomme;
    }

    public void setEstHomme(boolean estHomme) {
        this.estHomme = estHomme;
    }

    public Droit getDroit() {
        return droit;
    }

    public void setDroit(Droit droit) {
        this.droit = droit;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Set<Categorie> getListeCategorie() {
        return listeCategorie;
    }

    public void setListeCategorie(Set<Categorie> listeCategorie) {
        this.listeCategorie = listeCategorie;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}
