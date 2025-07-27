package com.marl1.gatling4interview.client.repository;

import com.marl1.gatling4interview.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByClientId(String clientId);
}
