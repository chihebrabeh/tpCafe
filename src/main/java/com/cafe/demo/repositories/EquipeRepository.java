package com.cafe.demo.repositories;

import com.cafe.demo.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository <Equipe,String> {
}
