package com.marl1.gatling4interview.client.dto;

import com.marl1.gatling4interview.client.entity.MembershipType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientDto {
    private String clientId;
    private String name;
    private String surname;
    private GenderDto gender;
    private MembershipType membershipType;
}