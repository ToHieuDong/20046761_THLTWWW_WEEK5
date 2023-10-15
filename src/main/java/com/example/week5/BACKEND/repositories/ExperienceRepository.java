package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
}
