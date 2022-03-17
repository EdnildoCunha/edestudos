package com.edestudos.edestudos.repositories;

import com.edestudos.edestudos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
