package com.cafe.demo.repositories;

import com.cafe.demo.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository  extends JpaRepository<Document , Integer> {
}
