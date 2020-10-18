package com.cafe.demo.repositories;

import com.cafe.demo.entities.ConsommationJour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsommationJourRepository extends JpaRepository<ConsommationJour,String> {
}
