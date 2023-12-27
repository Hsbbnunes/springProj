package com.projtry.springBoot.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projtry.springBoot.entities.User;
import com.projtry.springBoot.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    private UserService service;

    @GetMapping
    public ResponseEntity <List <User>> findAll() {
        List <User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
}
