package com.nimash.customer.customer;

import lombok.AllArgsConstructor;
import lombok.Builder; //enables the Builder Design pattern for creating objects.
import lombok.Data; //Normally, we use @Data instead of manually adding @Getter, @Setter, @ToString
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//defines a Customer entity class that will be stored in a Mongodb collection , using Lombok to reduce boilerplate code


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
//tells Spring Data Mongodb to map this class to a Mongodb collection named customer (default name is the class name in lowercase)

public class Customer {
    @Id //marks the primary key field
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}


// Why Required Arg Constructor method is hard rather than Builder design pattern
// in Required Arg Constructor method,
/*
1) You must remember the order of parameters.
2) If there are many fields, it's hard to read.
3) If you add a new field later, constructors can break.
*/


// Spring Data JPA = Relational DataBases
// Spring Data Mongodb = Mongodb Databases