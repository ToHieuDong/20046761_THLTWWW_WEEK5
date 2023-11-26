package com.example.week5.FRONTEND.controllers;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import com.example.week5.BACKEND.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Controller
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateServices candidateServices;

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/can";
    }

    @GetMapping("/listPage")
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Candidate> candidatePage= candidateServices.findAll(currentPage - 1,pageSize,"canId","asc");


        model.addAttribute("candidatePage", candidatePage);

        int totalPages = candidatePage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "candidates/candidates-paging";
    }



}
