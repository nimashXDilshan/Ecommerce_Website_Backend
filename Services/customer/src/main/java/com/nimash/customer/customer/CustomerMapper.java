package com.nimash.customer.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    // map CustomerRequest(DTO) to the Customer entity(Database object)
    // method returns Customer Object
    public Customer toCustomer(CustomerRequest request) {
        if (request == null) {
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .address(request.address())
                .build();
        // map the dto values to the database object attributes
    }

    // map database object attributes to the dto object
    public CustomerResponse fromCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}