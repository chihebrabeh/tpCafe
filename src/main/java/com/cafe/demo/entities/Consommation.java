package com.cafe.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data @NoArgsConstructor
public class Consommation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Consommation_SEQ")
    @SequenceGenerator(sequenceName = "Consommation_SEQ", allocationSize = 1, name = "Consommation_SEQ")
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name="consommationJour", nullable=true)
    private ConsommationJour consommationJour;

    @ManyToOne
    @JoinColumn(name="demande", nullable=false)
    private Demande demande;

    public Consommation (Demande demande){

        this.demande=demande ;
    }


}
