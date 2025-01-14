package com.example.demo.university;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UniversityRepository extends
        JpaRepository<University, Long>{
    //    @Query("SELECT u FROM University u WHERE u.country = ?1")
    Optional<University> findUniversityByCountry(String country);
}
