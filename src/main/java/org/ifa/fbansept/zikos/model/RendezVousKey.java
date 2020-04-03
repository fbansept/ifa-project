package org.ifa.fbansept.zikos.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
class RendezVousKey implements Serializable {

    @Column(name = "utilisateur_1_id")
    Integer utilisateur1Id;

    @Column(name = "utilisateur_2_id")
    Integer utilisateur2Id;

    public Integer getUtilisateur1Id() {
        return utilisateur1Id;
    }

    public void setUtilisateur1Id(Integer utilisateur1Id) {
        this.utilisateur1Id = utilisateur1Id;
    }

    public Integer getUtilisateur2Id() {
        return utilisateur2Id;
    }

    public void setUtilisateur2Id(Integer utilisateur2Id) {
        this.utilisateur2Id = utilisateur2Id;
    }
}