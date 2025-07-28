package com.marl1.gatling4interview.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientDto {
    private String clientId;
    private String name;
    private String surname;
    private GenderDto gender;
    private MembershipTypeDto membershipType;
}