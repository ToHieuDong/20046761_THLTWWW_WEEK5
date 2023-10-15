package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SkillRepository extends JpaRepository<Skill, UUID> {
}
