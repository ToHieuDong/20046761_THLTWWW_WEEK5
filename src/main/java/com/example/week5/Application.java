package com.example.week5;

import com.example.week5.BACKEND.repositories.AddressRepository;
import com.example.week5.BACKEND.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
//    @Bean
    CommandLineRunner initData(){
        return args -> {
//            List<Candidate> lisCan = candidateRepository.findAll();
//            lisCan.forEach(System.out::println);

//            Random rnd =new Random();
//            for (int i = 1; i < 1000; i++) {
//                Address add = new Address(UUID.randomUUID(),"Quang Trung","HCM",
//                        rnd.nextInt(70000,80000)+"", "123", "1234" );
//                addressRepository.save(add);
//
//                Candidate can=new Candidate(UUID.randomUUID(),
//                        LocalDate.of(1998,11,10),
//                        "email_"+i+"@gmail.com", "name#"+i, "12345",  add);
//                candidateRepository.save(can);
//                System.out.println("Added: " +can);
//            }
        };
    }

}
