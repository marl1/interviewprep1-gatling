package com.marl1.gatling4interview.security.controller;

import com.marl1.gatling4interview.security.JwtUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/jwt")
    public ResponseEntity<String> getToken() {
        return ResponseEntity.ok(JwtUtils.createJwt());
    }
}
