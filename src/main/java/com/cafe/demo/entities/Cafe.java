package com.cafe.demo.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Cafe")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cafe implements Serializable {
    @Id
    private String type ;


    private Double prixUnitaire;
/*
    @ManyToOne
    @JoinColumn(name="Demande", nullable=true)
    private Demande Demande ;
*/

}
