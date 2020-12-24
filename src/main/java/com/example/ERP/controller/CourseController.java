package com.example.ERP.controller;

import com.example.ERP.beans.Course;
import com.example.ERP.beans.Course_Schedule;
import com.example.ERP.services.CourseScheduleServices;
import com.example.ERP.services.CourseService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


@Path("courses")
public class CourseController {


    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourses() {
        List<String> Term = new ArrayList<>();
        Term.add("1");
        Term.add("2");
        Term.add("3");
        Term.add("4");
        return Response.ok().entity(Term).build();
    }


    @POST
    @Path("/register")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerCourses(Course course) throws URISyntaxException {
        System.out.println("Hello Anshul");
        System.out.println(course.getCourse_code());
        System.out.println(course.getName());
        System.out.println(course.getDescription());
        System.out.println(course.getYear());
        System.out.println(course.getTerm());
        System.out.println(course.getCredits());
        System.out.println(course.getCapacity());
        System.out.println(course.getFaculty());
        CourseService coursesService = new CourseService();
        System.out.println("a1");
        coursesService.addCourses(course);
        System.out.println("a2");
        return Response.ok().build();
    }

    @POST
    @Path("/display")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginStudent() throws URISyntaxException {
        System.out.println("helllo");
        CourseService courseService= new CourseService();
        List<Course> courses = new ArrayList<Course>();
        courses  = courseService.fetchTT();
        // System.out.println(courses.);
        if(courses == null){
            return Response.noContent().build();
        }
        System.out.println(courses.size());
        return Response.ok().entity(courses).build();
    }

    @POST
    @Path("/checkDomain")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkC(String domain_id) throws URISyntaxException {
        System.out.println(domain_id);
        CourseService courseService= new CourseService();
        ArrayList<Course> courses = new ArrayList<Course>();
        String num = domain_id.replaceAll("[^0-9]","");
        Integer id = Integer.parseInt(num);
        courses  = courseService.checkDomain(id);
        if(courses == null){
            return Response.noContent().build();
        }
        System.out.println(id);
        return Response.ok().entity(courses).build();
    }

}