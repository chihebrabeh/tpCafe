package com.cafe.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
public class ConsommationSemaine implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String Semaine ;

    private int nbGobles ;
 // relation avec la table chef de projet
    @ManyToOne
    @JoinColumn(name="chefProjet", nullable=false)
    private ChefProjet chefProjet ;

    @OneToMany(mappedBy = "consommationSemaine")
   private Set<ConsommationJour> consommationJours;


    public ConsommationSemaine (String semaine , int nbGobles , ChefProjet chefProjet){
        this.Semaine = semaine ;
        this.nbGobles = nbGobles ;
        this.chefProjet =chefProjet ;
    }

}
