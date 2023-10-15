package com.example.week5.BACKEND.entity;

import com.example.week5.BACKEND.IDs.JobSkillID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

@Component
@Entity
@Table(name = "job_skill")
@IdClass(JobSkillID.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSkill implements Serializable {
    private String moreInfos;
    private int skillLever;
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobSkill jobSkill)) return false;
        return Objects.equals(getJob(), jobSkill.getJob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJob());
    }
}
