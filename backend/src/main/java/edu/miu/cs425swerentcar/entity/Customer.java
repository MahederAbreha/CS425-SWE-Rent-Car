package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private Long CustomerId;
}
