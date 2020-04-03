package org.ifa.fbansept.zikos.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "chef")
@EntityListeners(AuditingEntityListener.class)
public class Chef extends Utilisateur{

    private int nombreEmploye;

    public int getNombreEmploye() {
        return nombreEmploye;
    }

    public void setNombreEmploye(int nombreEmploye) {
        this.nombreEmploye = nombreEmploye;
    }
}
