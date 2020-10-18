package com.cafe.demo.repositories;

import com.cafe.demo.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeRepository  extends JpaRepository<Demande,Integer> {

    @Override
    List<Demande> findAll();
}
