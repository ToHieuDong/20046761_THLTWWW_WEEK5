package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.IDs.JobSkillID;
import com.example.week5.BACKEND.entity.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}
