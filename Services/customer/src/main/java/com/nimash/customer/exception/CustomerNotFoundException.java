package com.nimash.customer.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data  //Generates getters, setters , toString(), equals(), and hashCode() // not generate constructors
public class CustomerNotFoundException extends RuntimeException {

    private final String msg;

}