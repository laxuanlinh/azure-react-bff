package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public ResponseEntity<Map<String, Object>> getUser(Authentication user){
        Map<String, Object> res = new HashMap<>();
        res.put("principal", user.getPrincipal());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("/api/data")
    public ResponseEntity<Map<String, Object>> getData(){
        Map<String, Object> res = new HashMap<>();
        res.put("data", "this is faked data for authenticated users only");
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
