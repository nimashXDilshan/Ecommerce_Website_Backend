package com.nimash.customer.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String > {
    //Customer = The entity class (mapped to a Mongodb collection).
    //String → The type of the _id field in Mongodb (here, id is a String).


    // Since it extends MongoRepository, it automatically provides CRUD operations(like findBYId , save(), findAll(), deleteById() )
    //Spring Data Mongodb will generate the queries automatically

}