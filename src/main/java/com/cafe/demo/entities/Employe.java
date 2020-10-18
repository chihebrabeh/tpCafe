package com.cafe.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
//definir une entité mappé au niveau de la base de données via l'implementation JPAz
@Entity
@Table(name = "Employe")
//l'heritage au niveau de classe Employe se définit comme une single table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//un champ pour specifier le role soit un dveloppeur , soit un chef de projet
@DiscriminatorColumn(
        name="Role",
        discriminatorType=DiscriminatorType.STRING
)
//défenition de la classe
@Data @NoArgsConstructor
public abstract class Employe implements Serializable {
    private static final long serialVersionUID = 1L;
    //l'identifiant de la classe
    @Id
    //type de generation de l'identifiant
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
    //generation d'une sequence dans la BD oracle
    @SequenceGenerator(sequenceName = "EMP_SEQ", allocationSize = 1, name = "EMP_SEQ")
    @Column(name = "id")
    //attribut id
    private int id;
    //attribut nom
    //l'annotation @Colomun permet de specifier le nom de l'attribut au niveau de BD
    @Column(name = "nom")
    private String nom ;
    //
    @Column(name = "prenom")
    private String prenom ;

    public Employe (String nom , String prenom ){
        this.nom = nom ;
        this.prenom = prenom ;
    }

}
