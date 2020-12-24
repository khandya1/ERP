package com.example.ERP.controller;
import com.example.ERP.beans.Student;
import com.example.ERP.services.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("/Student")

public class StudentController {
    @POST
    @Path("/putStu")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)

    public Response registerStudent(Student student) throws URISyntaxException
    {
        System.out.println(student.getRoll_no());
        System.out.println(student.getFirst_name());
        System.out.println(student.getLast_name());
        System.out.println(student.getEmail());
        System.out.println(student.getPic_path());
        System.out.println(student.getCgpa());
        System.out.println(student.getTotal_credit());
        System.out.println(student.getGrad_year());
        StudentService studentService = new StudentService();
        System.out.println("a1");
        studentService.addStudent(student);
     //   studentService.fetchStudent();
        System.out.println("a2");
        return Response.ok().build();
    }


    @POST
    @Path("/login")
    // @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginStudent(Student student) throws URISyntaxException {
        StudentService studentServices= new StudentService();
        List<Student> students = new ArrayList<Student>();
        students  = studentServices.fetchTT(student);
        if(students == null){
            return Response.noContent().build();
        }

        return Response.ok(students).build();
    }
}







