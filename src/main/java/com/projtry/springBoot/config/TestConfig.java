package com.projtry.springBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projtry.springBoot.entities.User;
import com.projtry.springBoot.repositories.UserRepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "Joao", "joao@gmail.com", "912842847", "123");
        User u2 = new User(null, "Manuel", "mn@gmail.com", "911242420", "1234");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
