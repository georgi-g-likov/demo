package com.example.demo.university;

import com.example.demo.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class University {

    @Id
    @SequenceGenerator(
            name = "university_sequence",
            sequenceName = "university_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "university_sequence"
    )
    private Long id;
    private String name;
    private String country;
    private String city;
    private Integer studentCount;
    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private List<Student> studentList;

    public University(){
    }

    public University(Long id, String name,
                      String country, String city, Integer studentCount) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.studentCount = studentCount;
    }

    public University(String name, String country,
                      String city, Integer studentCount) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.studentCount = studentCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}
