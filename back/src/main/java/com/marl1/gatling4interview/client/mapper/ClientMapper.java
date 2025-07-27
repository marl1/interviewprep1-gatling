package com.marl1.gatling4interview.client.mapper;

import com.marl1.gatling4interview.client.dto.ClientDto;
import com.marl1.gatling4interview.client.dto.GenderDto;
import com.marl1.gatling4interview.client.entity.Client;
import com.marl1.gatling4interview.client.entity.Gender;

public class ClientMapper {
    public ClientDto entityToDto(Client client) {
        return new ClientDto(
                client.getClientId(),
                client.getName(),
                client.getSurname(),
                client.getGender()== Gender.M?GenderDto.M:GenderDto.F,
                client.getMembershipType()
        );
    }
}
