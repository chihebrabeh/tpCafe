package com.cafe.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
public class ConsommationJour implements Serializable {

    @Id
    private String jour ;
    private int nbGobles ;

    @ManyToOne
    @JoinColumn(name="consommationSemaine")
    private ConsommationSemaine consommationSemaine;

    @OneToMany(mappedBy = "consommationJour")
    private Set<Consommation> consommations;

    public ConsommationJour (String jour  , int nbGobles){
     this.jour=jour ;
     this.nbGobles=nbGobles ;
    }

}
