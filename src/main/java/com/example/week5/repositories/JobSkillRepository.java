package com.example.week5.repositories;

import com.example.week5.entity.Company;
import com.example.week5.entity.Job;
import com.example.week5.entity.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobSkillRepository extends JpaRepository<JobSkill, Job> {
}
