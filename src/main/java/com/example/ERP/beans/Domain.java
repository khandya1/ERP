package com.example.ERP.beans;

import javax.persistence.*;

@Entity
@Table(name = "domain")
public class Domain {
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
}
