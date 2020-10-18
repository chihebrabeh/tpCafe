package com.cafe.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class User {

    @Id
    private int id ;

    private  String name ;

    @OneToMany(mappedBy = "userId")
    private List<Document> docs = new ArrayList<>();
}

