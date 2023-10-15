package com.example.week5.FRONTEND.controllers;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.repositories.AddressRepository;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import com.example.week5.BACKEND.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;
//    @Autowired
//    private AddressRepository addressRepository;

    @GetMapping("/list")
    public String showListCandidate(Model model) {
        List<Candidate> lisCan = candidateRepository.findAll();

        lisCan.forEach(System.out::println);

        model.addAttribute("listCan", lisCan);

        return "candidate/candidates";
    }
}
