package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.IDs.CandidateSkillID;
import com.example.week5.BACKEND.entity.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillID> {
}
