package com.example.week5.BACKEND.IDs;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.entity.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CandidateSkillID implements Serializable {
    private Candidate candidate;
    private Skill skill;
}
