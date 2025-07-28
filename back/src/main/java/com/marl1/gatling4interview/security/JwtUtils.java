package com.marl1.gatling4interview.security;
import io.jsonwebtoken.Jwts;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JwtUtils {


    public static String createJwt() {
        return Jwts.builder()
                .claim("id", "abc123")
                .claim("role", "admin")
                /*.addClaims(Map.of("id", "abc123",
                        "role", "admin"))*/
                .setIssuer("TestApplication")
                .setIssuedAt(java.util.Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plus(10, ChronoUnit.MINUTES)))
                .compact();
    }



}
