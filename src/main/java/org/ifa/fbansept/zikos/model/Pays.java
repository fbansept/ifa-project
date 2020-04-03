package org.ifa.fbansept.zikos.model;

import com.fasterxml.jackson.annotation.JsonView;
import org.ifa.fbansept.zikos.view.MyJsonView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "pays")
@EntityListeners(AuditingEntityListener.class)
public class Pays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({MyJsonView.Utilisateur.class})
    private int id;

    @JsonView({MyJsonView.Utilisateur.class})
    private String nom;



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
}
