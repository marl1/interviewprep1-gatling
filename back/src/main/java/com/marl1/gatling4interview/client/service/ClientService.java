package com.marl1.gatling4interview.client.service;

import com.marl1.gatling4interview.client.dto.ClientDto;
import com.marl1.gatling4interview.client.entity.Client;
import com.marl1.gatling4interview.client.mapper.ClientMapper;
import com.marl1.gatling4interview.client.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    ClientMapper clientMapper = new ClientMapper();

    public Optional<ClientDto> getClient(String clientId) {
        System.out.println("getClient result: "+clientRepository.findByClientId(clientId));
        return clientRepository.findByClientId(clientId).stream().findFirst().map(clientMapper::entityToDto);
    }

    public Client postClient(ClientDto clientDto) {
        System.out.println("postClient: "+clientDto.getClientId());
        return clientRepository.save(clientMapper.dtoToEntity(clientDto));
    }
}
