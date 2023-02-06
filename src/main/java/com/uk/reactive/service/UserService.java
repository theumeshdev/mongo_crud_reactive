package com.uk.reactive.service;

import com.uk.reactive.entity.User;
import com.uk.reactive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @Autowired
    UserRepository repository;
    public Mono<User> saveProduct(Mono<User> userMono){
        System.out.println("service method called ...");
        return repository.insert(userMono).next();
    }

}
