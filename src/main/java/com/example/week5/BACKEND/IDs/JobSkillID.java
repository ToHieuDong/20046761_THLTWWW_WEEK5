package com.example.week5.BACKEND.IDs;

import com.example.week5.BACKEND.entity.Job;
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
public class JobSkillID implements Serializable {
    private Job job;
    private Skill skill;
}
