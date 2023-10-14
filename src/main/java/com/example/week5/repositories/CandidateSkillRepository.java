package com.example.week5.repositories;

import com.example.week5.entity.CandidateSkill;
import com.example.week5.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Skill> {
}
