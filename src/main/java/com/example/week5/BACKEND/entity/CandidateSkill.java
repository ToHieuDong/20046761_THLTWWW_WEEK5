package com.example.week5.BACKEND.entity;

import com.example.week5.BACKEND.IDs.CandidateSkillID;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Entity
@Table(name = "candidate_skill")
@IdClass(CandidateSkillID.class)
@Getter@Setter@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CandidateSkill implements Serializable {
    @Id
    @ManyToOne
//    @MapsId("candidate") // Ánh xạ candidate vào CandidateSkillID
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Id
    @ManyToOne
//    @MapsId("skill") // Ánh xạ skill vào CandidateSkillID
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private String more_infos;
    private int skill_lever;

}
