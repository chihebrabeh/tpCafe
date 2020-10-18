package com.cafe.demo.repositories;

import com.cafe.demo.entities.Developpeur;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DeveloppeurRepository  extends JpaRepository<Developpeur,Integer> {
}
