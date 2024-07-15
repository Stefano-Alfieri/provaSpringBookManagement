package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Autore;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {

}
