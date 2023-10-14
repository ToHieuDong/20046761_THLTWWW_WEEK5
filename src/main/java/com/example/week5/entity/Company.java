package com.example.week5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @Column(name = "comp_id", columnDefinition = "bigint(20)")
    private UUID compId;
    @Column(name = "about", length = 50)
    private String about;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "conpName", length = 50)
    private String conpName;
    @Column(name = "phone", length = 50)
    private String phone;
    @Column(name = "webURL", length = 50)
    private String webURL;
    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;
}
