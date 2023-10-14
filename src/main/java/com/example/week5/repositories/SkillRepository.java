package com.example.week5.repositories;

import com.example.week5.entity.Company;
import com.example.week5.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SkillRepository extends JpaRepository<Skill, UUID> {
}
