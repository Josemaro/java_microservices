package com.microservices.customer.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private String firstName;
    private String lastName;
    private String email;
}
