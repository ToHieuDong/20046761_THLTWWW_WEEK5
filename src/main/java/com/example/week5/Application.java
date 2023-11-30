package com.example.week5;

import com.example.week5.BACKEND.IDs.CandidateSkillID;
import com.example.week5.BACKEND.entity.Address;
import com.example.week5.BACKEND.entity.Candidate;
import com.example.week5.BACKEND.entity.CandidateSkill;
import com.example.week5.BACKEND.entity.Skill;
import com.example.week5.BACKEND.repositories.AddressRepository;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import com.example.week5.BACKEND.repositories.CandidateSkillRepository;
import com.example.week5.BACKEND.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.week5.BACKEND.repositories")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private CandidateSkillRepository candidateSkillRepository;
    @Bean
    CommandLineRunner initData(){
        return args -> {


            Random rnd =new Random();

            for (int i = 1; i <= 10; ++i) {
                Skill skill = new Skill("Skill description #" + i, "Skill name #" + i, i);
                skillRepository.save(skill);
            }

            for (int i = 1; i < 1000; i++) {
                Address add = new Address(UUID.randomUUID(),"Quang Trung","HCM",
                        rnd.nextInt(70000,80000)+"", "123", "1234" );
                addressRepository.save(add);

                Candidate can=new Candidate(
                        LocalDate.of(1998,11,10),
                        "email_"+i+"@gmail.com", "name#"+i, i+"",  add);
                candidateRepository.save(can);
            }

            List<Skill> skillList = skillRepository.findAll();
            for (Candidate can: candidateRepository.findAll()) {
                CandidateSkill canSkill = new CandidateSkill(can, skillList.get(rnd.nextInt(skillList.size())), "info", rnd.nextInt(10));
                candidateSkillRepository.save(canSkill);
            }



        };
    }

}
