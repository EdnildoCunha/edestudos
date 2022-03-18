package com.edestudos.edestudos.services;

import java.util.List;
import java.util.Optional;

import com.edestudos.edestudos.entities.Category;
import com.edestudos.edestudos.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
        
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id) ;
        return obj.get();
    }
}