package com.edestudos.edestudos.repositories;

import com.edestudos.edestudos.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
