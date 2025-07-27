package com.marl1.gatling4interview.client.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Client {
    private @Id
    @GeneratedValue Long id;
    private String clientId;
    private String name;
    private String surname;
    private Gender gender;
    private MembershipType membershipType;

}
