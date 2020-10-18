package com.cafe.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipe implements Serializable {

    @Id
    private String LibEquipe;

    private int nbCafe;

    @OneToMany (mappedBy = "equipe")
    private Set<Developpeur> developpeurs;

    public Equipe (String LibEquipe, int nbCafe){
        this.LibEquipe=LibEquipe;
        this.nbCafe=nbCafe;
    }

}
