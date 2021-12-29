package com.vidyaniwas;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
        ) {
}
