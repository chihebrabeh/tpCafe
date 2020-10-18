package com.cafe.demo.repositories;

import com.cafe.demo.entities.ChefProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefProjetRepository extends JpaRepository<ChefProjet,Integer> {
}
