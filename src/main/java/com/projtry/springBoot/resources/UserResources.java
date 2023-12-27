package com.projtry.springBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projtry.springBoot.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity <User> findAll() {
        User u = new User(1L, "Ze", "ze@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
    
}
