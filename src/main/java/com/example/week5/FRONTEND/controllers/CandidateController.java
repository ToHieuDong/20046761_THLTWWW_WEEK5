package com.example.week5.FRONTEND.controllers;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/can";
    }


}
