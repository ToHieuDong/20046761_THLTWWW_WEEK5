package com.example.week5.BACKEND.services;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> findAll() {

        return candidateRepository.findAll();
    }

    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy,
                                   String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);//findFirst.../findTop...
    }

}
