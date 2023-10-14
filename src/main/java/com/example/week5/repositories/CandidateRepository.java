package com.example.week5.repositories;

import com.example.week5.entity.Candidate;
import com.example.week5.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidateRepository extends JpaRepository<Candidate, UUID> {
}