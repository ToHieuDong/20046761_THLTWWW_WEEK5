package com.example.week5.BACKEND.services;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }
}
