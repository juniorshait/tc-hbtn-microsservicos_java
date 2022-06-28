package com.example.jpah2demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
