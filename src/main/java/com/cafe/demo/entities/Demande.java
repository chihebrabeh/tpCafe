package com.cafe.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Data
@NoArgsConstructor
@Entity
public class Demande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Demande_SEQ")
    @SequenceGenerator(sequenceName = "Demande_SEQ", allocationSize = 1, name = "Demande_SEQ")
    @Column(name = "id")
    private int id ;

    @ManyToOne
    @JoinColumn(name="developpeur")
    private Developpeur developpeur;



    @ManyToOne
    @JoinColumn(name="cafe")
    private Cafe cafe ;

    @OneToMany(mappedBy = "demande")
    private Set<Consommation> consommations;

    public Demande (Developpeur developpeur , Cafe cafe){
    this.developpeur=developpeur ;
    this.cafe=cafe;
    }

}
