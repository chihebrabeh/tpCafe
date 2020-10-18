package com.cafe.demo.repositories;

import com.cafe.demo.entities.ConsommationSemaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsommationSemaineRepository extends JpaRepository<ConsommationSemaine,String> {
}
