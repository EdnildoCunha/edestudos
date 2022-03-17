package com.edestudos.edestudos.repositories;

import com.edestudos.edestudos.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
