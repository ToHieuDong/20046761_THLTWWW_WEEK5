package com.example.week5.resources;

import com.example.week5.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class CandidateResources {
    @Autowired
    private CandidateServices candidateServices;
}
