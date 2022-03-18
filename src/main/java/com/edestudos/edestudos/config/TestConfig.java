package com.edestudos.edestudos.config;

import java.time.Instant;
import java.util.Arrays;

import com.edestudos.edestudos.entities.Order;
import com.edestudos.edestudos.entities.User;
import com.edestudos.edestudos.entities.enums.OrderStatus;
import com.edestudos.edestudos.repositories.OrderRepository;
import com.edestudos.edestudos.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria da Silva", "maria@gmail.com", "9888888888", "123456");
        User u2 = new User(null, "Joao da Silva", "joao@gmail.com", "9877777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    };



}