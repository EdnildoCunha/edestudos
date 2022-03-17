package com.edestudos.edestudos.config;

import java.util.Arrays;

import com.edestudos.edestudos.entities.User;
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

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria da Silva", "maria@gmail.com", "9888888888", "123456");
        User u2 = new User(null, "Joao da Silva", "joao@gmail.com", "9877777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    };


}
