package com.cafe.demo.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "DEVELOPPEUR")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue(value="Developpeur")
@AllArgsConstructor
@NoArgsConstructor
public class Developpeur extends Employe implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "bureau")
    private  String bureau ;

    @Column(name = "salaire")
    private Double salaire;

    @OneToMany(mappedBy = "developpeur", fetch = FetchType.EAGER)
    private  Set<Demande> demandes ;

    @ManyToOne
    @JoinColumn(name="equipe", nullable=false)
    private Equipe equipe ;

    public Developpeur(String nom,String prenom , String by, Double salaire,Equipe equipe){
        super(nom,prenom);
        this.bureau = by;
        this.salaire=salaire ;
        this.equipe=equipe;
    }

}
