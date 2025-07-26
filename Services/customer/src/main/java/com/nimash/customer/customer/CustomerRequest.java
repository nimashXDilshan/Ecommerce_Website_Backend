package com.nimash.customer.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

// record automatically generate getters , constructors , equals(),toString() and hashCode()
/*
When a request is sent to the API:
JSON is automatically converted to CustomerRequest
*/

public record CustomerRequest(    //which is used as a Data Transfer Object (DTO)
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer firstname is required")
        String lastname,
        @NotNull(message = "Customer Email is required")
        @Email(message = "Customer Email is not a valid email address")
        String email,
        Address address
) {
// class body
}