package com.example.ERP.controller;

import com.example.ERP.beans.Course_Schedule;
import com.example.ERP.services.CourseScheduleServices;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("courseschedule")
public class Course_ScheduleController {


    @POST
    @Path("/display")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response fetchCourseS() throws URISyntaxException {
        System.out.println("helllo");
        CourseScheduleServices courseScheduleServices= new CourseScheduleServices();
        List<Course_Schedule> course_schedules = new ArrayList<Course_Schedule>();
        course_schedules  = courseScheduleServices.fetchCS();
        // System.out.println(courses.);
        if(course_schedules == null){
            return Response.noContent().build();
        }
        System.out.println(course_schedules.size());
        return Response.ok().entity(course_schedules).build();
    }

    @POST
    @Path("/checkCourse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkC(String course_id) throws URISyntaxException {
        System.out.println(course_id);
        CourseScheduleServices courseScheduleServices= new CourseScheduleServices();
        ArrayList<Course_Schedule> course_schedules = new ArrayList<Course_Schedule>();
        String num = course_id.replaceAll("[^0-9]","");
        Integer id = Integer.parseInt(num);
        course_schedules  = courseScheduleServices.checkCourse(id);
        if(course_schedules == null){
            return Response.noContent().build();
        }
        System.out.println(id);
        return Response.ok().entity(course_schedules).build();
    }

}
