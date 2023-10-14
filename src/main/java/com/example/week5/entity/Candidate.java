package com.example.week5.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    @Id
    @Column(name = "can_id", columnDefinition = "bigint(20)")
    private UUID can_id;
    @Column(name = "dob", columnDefinition = "datetime")
    private LocalDate dob;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "fullName", length = 50)
    private String fullName;
    @Column(name = "phone", length = 50)
    private String phone;

    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "add_id")
    private Address address;
}
