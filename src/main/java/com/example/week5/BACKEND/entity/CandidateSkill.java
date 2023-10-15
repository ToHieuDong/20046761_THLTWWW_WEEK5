package com.example.week5.BACKEND.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Entity
@Table(name = "candidate_skill")
@IdClass(CandidateSkill.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateSkill implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private String more_infos;
    private int skill_lever;





}
