package com.example.hello.controller;

import com.example.hello.dto.PostRequestDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping("/hello")
    public String getHello() {
        return "get Hello";
    }

    @RequestMapping("/hi") // get/post/put/delete 모두 사용하게 됨.
    public String getHi() {
        return "get Hi";
    }

    @GetMapping("/path-variable/{irum}")
    public String pathVariable(@PathVariable(name="irum") String pathName) {
        return pathName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuffer sb = new StringBuffer();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {

        return name+email+age;
    }
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
/*
        requestData.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });*/

        requestData.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

    }

    @PostMapping("/post2")
    public void post2(@RequestBody PostRequestDTO dto) {
        System.out.println(dto.toString());
    }
}
