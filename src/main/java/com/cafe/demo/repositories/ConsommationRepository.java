package com.cafe.demo.repositories;

import com.cafe.demo.entities.Consommation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConsommationRepository extends JpaRepository<Consommation,Integer> {
}
