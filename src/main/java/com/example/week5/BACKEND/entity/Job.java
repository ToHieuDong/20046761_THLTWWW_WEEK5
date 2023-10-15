package com.example.week5.BACKEND.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Entity
@Table(name = "job")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @Column(name = "job_id")
    private UUID jobId;
    @Column(name = "jobDesc", length = 50)
    private String jobDesc;
    @Column(name = "jobName", length = 50)
    private String jobName;

    @OneToOne
    @JoinColumn(name = "comp_id")
    private Company company;
}
