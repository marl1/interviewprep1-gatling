package com.marl1.gatling4interview.client.mapper;

import com.marl1.gatling4interview.client.dto.ClientDto;
import com.marl1.gatling4interview.client.dto.GenderDto;
import com.marl1.gatling4interview.client.dto.MembershipTypeDto;
import com.marl1.gatling4interview.client.entity.Client;
import com.marl1.gatling4interview.client.entity.Gender;
import com.marl1.gatling4interview.client.entity.MembershipType;

public class ClientMapper {
    public ClientDto entityToDto(Client client) {
        return new ClientDto(
                client.getClientId(),
                client.getName(),
                client.getSurname(),
                client.getGender()== Gender.M?GenderDto.M:GenderDto.F,
                MembershipTypeDto.valueOf(client.getMembershipType().toString())
        );
    }

    public Client dtoToEntity(ClientDto clientDto) {
        return new Client(
                null,
                clientDto.getClientId(),
                clientDto.getName(),
                clientDto.getSurname(),
                clientDto.getGender()== GenderDto.M?Gender.M:Gender.F,
                MembershipType.valueOf(clientDto.getMembershipType().toString())
        );
    }
}
