package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import com.example.demo.university.University;
import com.example.demo.university.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(UniversityRepository universityRepository, StudentRepository studentRepository){
        return args -> {
            University PU = new University(
                    "Paisii Hilendarski",
                    "BG",
                    "Plovdiv",
                    5000
            );
            universityRepository.saveAll(
                    List.of(PU)
            );
            Student georgi = new Student(
                    "Georgi",
                    LocalDate.of(2004, Month.OCTOBER,10),
                    "georgi@gmail.com",
                    PU
            );

            Student ivan = new Student(
                    "Ivan",
                    LocalDate.of(2005, Month.JANUARY,11),
                    "ivan@gmail.com",
                    PU
            );

            studentRepository.saveAll(
                    List.of(georgi,ivan)
            );
        };
    }
}
