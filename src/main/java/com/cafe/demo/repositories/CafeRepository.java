package com.cafe.demo.repositories;

import com.cafe.demo.entities.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CafeRepository extends JpaRepository<Cafe,String> {
    @Override
    List<Cafe> findAll();
}
