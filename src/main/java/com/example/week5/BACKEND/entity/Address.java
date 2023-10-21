package com.example.week5.BACKEND.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@Entity
@Table(name = "address")
@Data
@NoArgsConstructor@AllArgsConstructor
public class Address {
    @Id
    @Column(name = "add_id")
    private UUID id;
    @Column(name = "street", length = 50)
    private String street;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "county", length = 50)
    private String county;
    @Column(name = "number", length = 50)
    private String number;
    @Column(name = "zipcode", length = 50)
    private String zipcode;

    @Override
    public String toString() {
        return street + ", " + city + ", " + county + ", " + number + ", " + zipcode ;
    }
}
