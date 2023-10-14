package com.example.week5.repositories;

import com.example.week5.entity.Company;
import com.example.week5.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
}
