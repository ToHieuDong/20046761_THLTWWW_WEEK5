package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
