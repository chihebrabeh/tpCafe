package com.cafe.demo.repositories;

import com.cafe.demo.entities.User;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();
}
