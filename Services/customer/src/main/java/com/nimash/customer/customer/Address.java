package com.nimash.customer.customer;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Address {

    @NotBlank(message = "Street is required")
    private String street;

    @NotBlank(message = "House number is required")
    private String houseNumber;

    @Pattern(regexp = "\\d{5}", message = "Zip code must be 5 digits")
    private String zipCode;
}
/*
When you pass this class as a request body in a controller,
        and annotate it with @Valid or @Validated in the method parameter,
Spring will validate its fields before executing the controller logic.
*/



// @Validated is only needed when you want method-level validation inside a @Service or @Component class.
/*
@Service
@Validated
public class AddressService {

    public void processAddress(@NotBlank String street) { ... }
}
*/