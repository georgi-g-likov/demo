package com.example.demo.university;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UniversityConfig {

    @Bean
    CommandLineRunner commandLineRunnerUniversity(UniversityRepository repository){
        return args -> {
            University PU = new University(
                    "Paisii Hilendarski",
                    "BG",
                    "Plovdiv",
                    5000
            );
            repository.saveAll(
                    List.of(PU)
            );
        };
    }
}
