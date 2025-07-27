package com.marl1.gatling4interview.client.controller;

import com.marl1.gatling4interview.client.dto.ClientDto;
import com.marl1.gatling4interview.client.dto.GenderDto;
import com.marl1.gatling4interview.client.entity.MembershipType;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/client/{clientId}")
    public ResponseEntity<ClientDto> getClient(String clientId) {
        System.out.println("lol");
        ClientDto clientDto = new ClientDto("cl1", "John", "Johnson", GenderDto.M, MembershipType.FREE_TIER);
        return new ResponseEntity<ClientDto>(clientDto, HttpStatus.OK);
    }
}
