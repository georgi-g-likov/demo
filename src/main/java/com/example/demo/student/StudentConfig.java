package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunnerStudent(StudentRepository repository) {
        return args -> {
            Student georgi = new Student(
                    "Georgi",
                    LocalDate.of(2004, Month.OCTOBER,10),
                    "georgi@gmail.com"
            );

            Student ivan = new Student(
                    "Ivan",
                    LocalDate.of(2005, Month.JANUARY,11),
                    "ivan@gmail.com"
            );

            repository.saveAll(
                    List.of(georgi,ivan)
            );
        };
    }
}
