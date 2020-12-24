package com.example.ERP.beans;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer course_id;

    @Column(nullable = false ,unique = true)
    private String course_code;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false)
    private Integer term;
    @Column(nullable = false)
    private Integer credits;
    @Column(nullable = false)
    private Integer capacity;
    @Column
    private String faculty;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY )
    @JoinColumn(name="course_id" )
    private List<Course_Schedule> course_schedules = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "course_domain", joinColumns = { @JoinColumn(name = "course_id")},
                inverseJoinColumns = {@JoinColumn(name = "domain_id")})
    private List<Domain> domain = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "course_student", joinColumns =  {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> student = new ArrayList<>();


    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Course() {

    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonbTransient

    public List<Course_Schedule> getCourse_schedules() {
        return course_schedules;
    }

    public void setCourse_schedules(List<Course_Schedule> course_schedules) {
        this.course_schedules = course_schedules;
    }
    @JsonbTransient
    public List<Domain> getDomain() {
        return domain;
    }

    public void setDomain(List<Domain> domain) {
        this.domain = domain;
    }

    @JsonbTransient
    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Course(String course_code, String name, String description, Integer year, Integer term, Integer credits, Integer capacity, String faculty) {
        this.course_code = course_code;
        this.name = name;
        this.description = description;
        this.year = year;
        this.term = term;
        this.credits = credits;
        this.capacity = capacity;
        this.faculty = faculty;

    }
}




