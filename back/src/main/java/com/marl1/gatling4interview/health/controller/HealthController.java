package com.marl1.gatling4interview.health.controller;

import com.marl1.gatling4interview.health.dto.HealthDto;
import com.marl1.gatling4interview.health.dto.HealthStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<HealthDto> getHealthStatus() {
        HealthDto healthResponse = new HealthDto(HealthStatus.HEALTHY);
        System.out.println("healthResponse=" + healthResponse);
        return new ResponseEntity<>(healthResponse, HttpStatus.ACCEPTED);
    }

}
