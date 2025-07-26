package com.marl1.gatling4interview.health.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HealthStatus {
    HEALTHY("healthy"),
    UNHEALTHY("unhealthy");

    private String text;

    HealthStatus(String text) {
        this.text = text;
    }

    @JsonValue
    public String getName() {
        return this.text;
    }
}
