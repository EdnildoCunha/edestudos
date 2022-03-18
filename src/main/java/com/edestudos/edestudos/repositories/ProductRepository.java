package com.edestudos.edestudos.repositories;

import com.edestudos.edestudos.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
