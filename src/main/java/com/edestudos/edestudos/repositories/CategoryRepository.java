package com.edestudos.edestudos.repositories;

import com.edestudos.edestudos.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
