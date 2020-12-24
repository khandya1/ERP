package com.example.ERP.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "domain")
public class Domain implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer domain_id;
    @Column(nullable = false)
    private String program;
    @Column(nullable = false)
    private String batch;

    public Domain(String program, String batch) {
        this.program = program;
        this.batch = batch;

    }
    @ManyToMany(mappedBy = "domains" , fetch = FetchType.EAGER)
    private List<Course> courses = new ArrayList<>();


    public Domain() {
    }
    public Integer getDomain_id() {
        return domain_id;
    }
    public void setDomain_id(Integer domain_id) {
        this.domain_id = domain_id;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
