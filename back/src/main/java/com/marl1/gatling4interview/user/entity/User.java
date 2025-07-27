package com.marl1.gatling4interview.user.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users") // Because User is reserved.
public class User {
    private @Id
    @GeneratedValue Long id;
    private String login;
    private boolean hasAccess = false;

    public User(String login, boolean hasAccess) { // Do I really need to create the constructor myself here ?
        this.login = login;
        this.hasAccess = hasAccess;
    }
}
