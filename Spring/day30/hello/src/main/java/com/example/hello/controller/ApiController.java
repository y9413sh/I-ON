package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String getHello() {
        return "이성호 Hello Spring boot";
    }

    @GetMapping("/date")
    public String getServerDate() {
        return "서버 날짜 : " + new Date();
    }

    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    @PostMapping("/json")
    // request -> object mapper -> object -> method -> object -> object mapper -> json -> response
    public User json(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    @PutMapping("/puts") // PUT, http://localhost:8080/api/put
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}

/*
{
    "name" : "yuna",
    "age" : 10,
    "phone_number" : "010-1111-2222",
    "address" : "서울시"
}

 */