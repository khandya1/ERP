package com.example.ERP.beans;
import javax.persistence.*;

@Entity
@Table (name = "course_domain")
public class Course_Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Course_Domain() {
    }
}
