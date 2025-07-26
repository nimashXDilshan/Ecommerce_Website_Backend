package com.nimash.customer.customer;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
    // class body

}

/*
Why CustomerRequest and CustomerResponse Are Separate?
1) CustomerRequest → Used when creating or updating a customer (input from client).
2) CustomerResponse → Used when sending data back to the client (output to client).
3) This prevents exposing unnecessary internal fields (e.g., passwords, DB IDs, etc.) in API responses.


 */