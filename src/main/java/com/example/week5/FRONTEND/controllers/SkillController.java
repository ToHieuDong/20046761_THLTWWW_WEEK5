package com.example.week5.FRONTEND.controllers;

import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.entity.CandidateSkill;
import com.example.week5.BACKEND.entity.Skill;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import com.example.week5.BACKEND.repositories.CandidateSkillRepository;
import com.example.week5.BACKEND.repositories.SkillRepository;
import com.example.week5.BACKEND.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private CandidateSkillRepository candidateSkillRepository;
    @Autowired
    private CandidateRepository candidateRepository;


    @GetMapping("/list")
    public String showSkillList(Model model) {
        model.addAttribute("skills", skillRepository.findAll());
        return "skills/skillSearch";
    }

    @PostMapping("/listCandidate")
    public String showCandidateListBySkill(Model model, @RequestParam("skillId") String skillId) {
        model.addAttribute("skills", skillRepository.findAll());
        Optional<Skill> skill = skillRepository.findById(Long.parseLong(skillId));
        if (skill.isPresent()) {

            List<CandidateSkill> list = candidateSkillRepository.findAllBySkill(skill.get());
            List<Candidate> candidateList = new ArrayList<>();
            for (CandidateSkill candidateSkill: list) {
                Optional<Candidate> candidate = candidateRepository.findById(candidateSkill.getCandidate().getCanId());
                if (candidate.isPresent())
                    candidateList.add(candidate.get());
            }
            model.addAttribute("candidates", candidateList);
            return "skills/skillSearch";
        }

        return "skills/skillSearch";
    }

}
