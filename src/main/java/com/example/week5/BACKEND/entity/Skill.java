package com.example.week5.BACKEND.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Entity
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long skillId;
    @Column(name = "description", length = 50)
    private String description;
    @Column(name = "skillName", length = 50)
    private String skillName;
    @Column(name = "type", columnDefinition = "int")
    private int type;

    @OneToMany(mappedBy = "skill", cascade = CascadeType.MERGE )
    private List<CandidateSkill> candidateSkills;

    public Skill(String description, String skillName, int type) {
        this.description = description;
        this.skillName = skillName;
        this.type = type;
    }
}
