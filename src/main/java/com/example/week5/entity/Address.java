package com.example.week5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@Entity
@Table(name = "address")
@Data
@NoArgsConstructor@AllArgsConstructor
public class Address {
    @Id
    @Column(name = "add_id", columnDefinition = "bigint(20)")
    private UUID id;
    @Column(name = "street", length = 50)
    private String street;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "county", length = 50)
    private short county;
    @Column(name = "number", length = 50)
    private String number;
    @Column(name = "zipcode", length = 50)
    private String zipcode;
}
