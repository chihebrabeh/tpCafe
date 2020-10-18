package com.cafe.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Documents")
public class Document  implements Serializable {
    @Id
    private  int id ;
    private  String fichier ;

    @ManyToOne
    private User userId ;
    public Document(int id , String file)
    {
        this.id=id ;
        this.fichier=file ;
    }
}
