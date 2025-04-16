package com.gabrielgodoi.userapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping("/")
public class DefaultResource {

    @GetMapping
    public ResponseEntity<String> standarResponse(){
        return ResponseEntity.ok().body("Seja bem vindo caraí");
    }
}
