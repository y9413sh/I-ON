package com.example.hello.controller;

import com.example.hello.dto.PostRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody PostRequestDTO dto) {
        System.out.println(dto.toString());
    }

    @PutMapping("/put/{userId}")
    public void put(@RequestBody PostRequestDTO dto, @PathVariable(name = "userId") Long id) {
        System.out.println(dto.toString());
    }
}

/*
"name" : "kingsmile",
"age" : 33,
"car_list" : [
    {
        "name":"BMW",
        "car_number":"11가1234"
    },
    {
        "name":"Audi",
        "car_number":"22가 7890"
    }
]
 */