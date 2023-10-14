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
@Table(name = "experience")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @Id
    @Column(name = "exp_id", columnDefinition = "bigint(20)")
    private UUID expId;
    @Column(name = "from_day", columnDefinition = "datetime")
    private LocalDate fromDay;
    @Column(name = "to_day", columnDefinition = "datetime")
    private LocalDate toDay;
    @Column(name = "role", length = 50)
    private String role;
    @Column(name = "wordDecription",  length = 50)
    private String wordDecription;

    @OneToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;



}
