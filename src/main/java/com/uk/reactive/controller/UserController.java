package com.uk.reactive.controller;

import com.uk.reactive.entity.User;
import com.uk.reactive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;
    @PostMapping("/save")
    public Mono<User> saveProduct(@RequestBody Mono<User> userMono){
        System.out.println("controller method called ...");
        return service.saveProduct(userMono);
    }

}
