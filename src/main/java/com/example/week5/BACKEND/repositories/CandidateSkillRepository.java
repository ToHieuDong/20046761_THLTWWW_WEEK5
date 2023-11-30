package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.IDs.CandidateSkillID;
import com.example.week5.BACKEND.entity.CandidateSkill;
import com.example.week5.BACKEND.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillID> {
    List<CandidateSkill> findAllBySkill(Skill skill);

}
