package com.example.ERP.beans;
import javax.json.bind.annotation.JsonbTransient;
import  javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "Student")
public class Student  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer student_id;
    @Column(nullable = false ,unique = true)
    private String roll_no;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column(nullable = false , unique = true)
    private String email;
    @Column(nullable = false)
    private String pic_path;
    @Column(nullable = false)
    private Integer cgpa;
    @Column(nullable = false)
    private Integer total_credit;
    @Column
    private Integer grad_year;

    @ManyToMany(mappedBy = "student")
    private List<Course> courses = new ArrayList<>();

    public Student() {
    }

    public Student(String roll_no, String first_name, String last_name, String email, String pic_path, Integer cgpa, Integer total_credit, Integer grad_year) {
        this.roll_no = roll_no;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.pic_path = pic_path;
        this.cgpa = cgpa;
        this.total_credit = total_credit;
        this.grad_year = grad_year;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public void setCgpa(Integer cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getTotal_credit() {
        return total_credit;
    }

    public void setTotal_credit(Integer total_credit) {
        this.total_credit = total_credit;
    }

    public Integer getGrad_year() {
        return grad_year;
    }

    public void setGrad_year(Integer grad_year) {
        this.grad_year = grad_year;
    }

    @JsonbTransient
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
