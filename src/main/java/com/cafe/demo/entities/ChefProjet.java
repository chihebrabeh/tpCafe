package com.cafe.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "CHEF_PROJET")
@Data
@NoArgsConstructor
@DiscriminatorValue(value="CHEF_PROJET")
public class ChefProjet extends Employe implements Serializable {

    //definition de la relation One to many avec La table Consommation par semaine
    @OneToMany(mappedBy="chefProjet")
    private Set<ConsommationSemaine> consommationSemaines;
    //definition de la relation ManyToOne avec La table  equipe
    @ManyToOne
    //pour définir le column de jointure
    @JoinColumn(name="equipe", nullable=false)
    private Equipe equipe ;

    public ChefProjet (String nom , String prenom , Equipe equipe){
        super(nom,prenom);
        this.equipe=equipe ;
    }

}
