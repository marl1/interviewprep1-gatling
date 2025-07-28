package com.marl1.gatling4interview.client.controller;

import com.marl1.gatling4interview.client.dto.ClientDto;
import com.marl1.gatling4interview.client.dto.GenderDto;
import com.marl1.gatling4interview.client.entity.Client;
import com.marl1.gatling4interview.client.entity.MembershipType;
import com.marl1.gatling4interview.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/client/{clientId}")
    public ResponseEntity<ClientDto> getClient(@PathVariable String clientId) {
        System.out.println("lol");
        Optional<ClientDto> clientDtoOptional = clientService.getClient(clientId);
        return clientDtoOptional
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/client")
    public Long postClient(@RequestBody ClientDto clientDto) {
        System.out.println("POST CLIENT !");
        return clientService.postClient(clientDto).getId();
    }
}
