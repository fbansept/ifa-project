package org.ifa.fbansept.zikos.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rendez_vous")
@EntityListeners(AuditingEntityListener.class)
@IdClass(RendezVousKey.class)
public class RendezVous {

    @Id
    private Integer utilisateur1Id;

    @Id
    private Integer utilisateur2Id;

    @ManyToOne
    @MapsId("utilisateur_1_id")
    @JoinColumn(name = "utilisateur_1_id")
    private Utilisateur utilisateur1;

    @ManyToOne
    @MapsId("utilisateur_2_id")
    @JoinColumn(name = "utilisateur_2_id")
    private Utilisateur utilisateur2;

    private Date date;

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

    public Utilisateur getUtilisateur1() {
        return utilisateur1;
    }

    public void setUtilisateur1(Utilisateur utilisateur1) {
        this.utilisateur1 = utilisateur1;
    }

    public Utilisateur getUtilisateur2() {
        return utilisateur2;
    }

    public void setUtilisateur2(Utilisateur utilisateur2) {
        this.utilisateur2 = utilisateur2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
