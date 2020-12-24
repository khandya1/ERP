package com.example.ERP;

import com.example.ERP.DAO.CourseDAO;
import com.example.ERP.DAO.DomainDAO;
import com.example.ERP.DAO.impl.CourseDAOImpl;
import com.example.ERP.DAO.impl.DomainDAOImpl;
import com.example.ERP.beans.Course_Schedule;
import com.example.ERP.beans.Course;
import com.example.ERP.beans.Domain;
import com.example.ERP.beans.Student;

import java.util.ArrayList;
import java.util.List;

public class CreateDatabase {
    public static void main(String[] args) {
        Course_Schedule courseSchedule1 = new Course_Schedule("9.30","Monday","C101","B1");
        Course_Schedule courseSchedule2 = new Course_Schedule("14.30","Wednesday","C102","B1");
        ArrayList<Course_Schedule> list1 = new ArrayList<Course_Schedule>();

        list1.add(courseSchedule1);
        list1.add(courseSchedule2);

        Course_Schedule courseSchedule3 = new Course_Schedule("9.30","Monday","C103","B1");
        Course_Schedule courseSchedule4 = new Course_Schedule("9.30","Tuesday","C101","B1");
        ArrayList<Course_Schedule> list2 = new ArrayList<Course_Schedule>();

        list2.add(courseSchedule3);
        list2.add(courseSchedule4);

        Course_Schedule courseSchedule5 = new Course_Schedule("11:00","Wednesday","C103","B1");
        Course_Schedule courseSchedule6 = new Course_Schedule("11:00","Thursday","C100","B1");
        ArrayList<Course_Schedule> list3 = new ArrayList<Course_Schedule>();

        list3.add(courseSchedule5);
        list3.add(courseSchedule6);

        Course_Schedule courseSchedule7 = new Course_Schedule("15.00","Tuesday","L103","B2");
        Course_Schedule courseSchedule8 = new Course_Schedule("11.00","Friday","L103","B2");
        ArrayList<Course_Schedule> list4 = new ArrayList<Course_Schedule>();

        list4.add(courseSchedule7);
        list4.add(courseSchedule8);

        Course_Schedule courseSchedule9 = new Course_Schedule("9.30","Tuesday","C107","B1");
        Course_Schedule courseSchedule10 = new Course_Schedule("9.30","Saturday","C108","B1");
        ArrayList<Course_Schedule> list5 = new ArrayList<Course_Schedule>();

        list5.add(courseSchedule9);
        list5.add(courseSchedule10);

        Course_Schedule courseSchedule11 = new Course_Schedule("14:30","Wednesday","L102","B2");
        Course_Schedule courseSchedule12 = new Course_Schedule("14:30","Thursday","L107","B2");
        ArrayList<Course_Schedule> list6 = new ArrayList<Course_Schedule>();

        list6.add(courseSchedule11);
        list6.add(courseSchedule12);

        Course_Schedule courseSchedule13 = new Course_Schedule("10:00","Monday","C101","B1");
        Course_Schedule courseSchedule14 = new Course_Schedule("10:00","Wednesday","C102","B1");
        ArrayList<Course_Schedule> list7 = new ArrayList<Course_Schedule>();

        list7.add(courseSchedule13);
        list7.add(courseSchedule14);

        Course_Schedule courseSchedule15 = new Course_Schedule("14:00 0","Tuesday","C204","B1");
        ArrayList<Course_Schedule> list8 = new ArrayList<Course_Schedule>();

        list8.add(courseSchedule15);

        Course course1 = new Course( "CS513","Software Systems","Software Systems",2020,1,4,150,"BT");
        Course course2 = new Course( "CS511","Algorithms","Algorithms",2020,1,4,150,"MVN");
        Course course3 = new Course( "GEN511","Machine Learning","Machine Learning",2020,1,4,150,"GSR");
        Course course4 = new Course( "GEN512","MML","MML",2020,1,4,150,"RAM");
        Course course5 = new Course( "CS816","SPE","SPE",2020,2,4,150,"BT");
        Course course6 = new Course( "DS603","Data Modeling","Data Modeling",2020,2,4,150,"RC");
        Course course7 = new Course( "CS812","ASR","ASR",2020,2,4,150,"RAM");
        Course course8 = new Course( "CS818","Advanced Algorithms","Advanced Algorithms",2020,2,4,150,"MVN");
        course1.setCourse_schedules(list1);
        course2.setCourse_schedules(list2);
        course3.setCourse_schedules(list3);
        course4.setCourse_schedules(list4);
        course5.setCourse_schedules(list5);
        course6.setCourse_schedules(list6);
        course7.setCourse_schedules(list7);
        course8.setCourse_schedules(list8);

        Domain domain1 = new Domain("MTECH","2020");
        Domain domain2 = new Domain("MSSE","2020");
        Domain domain3 = new Domain("IMTECHCS","2016");
        Domain domain4 = new Domain("PHD","2018");

        List<Domain> domainSet1 = new ArrayList<Domain>();
        domainSet1.add(domain1);
        domainSet1.add(domain2);
        List<Domain> domainSet2 = new ArrayList<Domain>();
        domainSet2.add(domain1);
        domainSet2.add(domain2);
        List<Domain> domainSet3 = new ArrayList<Domain>();
        domainSet3.add(domain1);
        domainSet3.add(domain2);
        domainSet3.add(domain3);
        List<Domain> domainSet4 = new ArrayList<Domain>();
        domainSet4.add(domain1);
        domainSet4.add(domain2);
        domainSet4.add(domain3);
        List<Domain> domainSet5 = new ArrayList<Domain>();
        domainSet5.add(domain1);
        domainSet5.add(domain2);
        domainSet5.add(domain3);
        domainSet5.add(domain4);
        List<Domain> domainSet6 = new ArrayList<Domain>();
        domainSet6.add(domain1);
        domainSet6.add(domain2);
        domainSet6.add(domain3);
        List<Domain> domainSet7 = new ArrayList<Domain>();
        domainSet7.add(domain1);
        domainSet7.add(domain2);
        domainSet7.add(domain4);
        domainSet7.add(domain3);
        List<Domain> domainSet8 = new ArrayList<>();
        domainSet8.add(domain1);
        domainSet8.add(domain3);


        course1.setDomain(domainSet1);
        course2.setDomain(domainSet2);
        course3.setDomain(domainSet3);
        course4.setDomain(domainSet4);
        course5.setDomain(domainSet5);
        course6.setDomain(domainSet6);
        course7.setDomain(domainSet7);
        course8.setDomain(domainSet8);


        Student stu1 = new Student("MT2020154","anshul","garg","anshulkumar.garg@iiitb.org","anshul_garg",8,10,2022);
        Student stu2 = new Student("MT2020040","yashasvi","khandelwal","yashasvi.khandelwal@iiitb.org","yashasvi_khandelwal",9,10,2022);
        Student stu3 = new Student("MT2020109","gourav","sachdev","gourav.sachdev@iiitb.org","gourav_sachdev",8,10,2022);
        Student stu4 = new Student("MT2020004","Manu","Dandotiya","Manu.Dandotiya@iiitb.org","Manu_",7,10,2022);
        Student stu5 = new Student("MT2020003","Hritik","Arora","Hritik.Arora@iiitb.org","Hritik_Arora",8,10,2022);
        Student stu6 = new Student("MT2020213","a","a1","a.a1@iiitb.org","a_a1",9,10,2022);
        Student stu7 = new Student("MT2020211","b","b1","b.b1@iiitb.org","b_b1",6,10,2021);
        Student stu8 = new Student("MT2020343","c","c1","c.c1@iiitb.org","c_c1",5,10,2023);
        Student stu9 = new Student("MT2020231","d","d1","d.d1@iiitb.org","d_d1",10,10,2021);
        Student stu10 = new Student("MT2020010","e","e1","e.e1@iiitb.org","e_e1",8,10,2022);


        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(stu1);
        studentList1.add(stu2);
        studentList1.add(stu4);
        studentList1.add(stu6);
        studentList1.add(stu10);
        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(stu2);
        studentList2.add(stu3);
        studentList2.add(stu4);
        studentList2.add(stu5);
        studentList2.add(stu9);
        List<Student> studentList3 = new ArrayList<Student>();
        studentList3.add(stu1);
        studentList3.add(stu3);
        studentList3.add(stu4);
        studentList3.add(stu5);
        studentList3.add(stu8);
        List<Student> studentList4 = new ArrayList<Student>();
        studentList4.add(stu1);
        studentList4.add(stu2);
        studentList4.add(stu4);
        studentList4.add(stu5);
        studentList4.add(stu9);
        studentList4.add(stu10);
        List<Student> studentList5 = new ArrayList<Student>();
        studentList5.add(stu1);
        studentList5.add(stu3);
        studentList5.add(stu6);
        studentList5.add(stu7);
        studentList5.add(stu8);
        List<Student> studentList6 = new ArrayList<Student>();
        studentList6.add(stu1);
        studentList6.add(stu2);
        studentList6.add(stu6);
        studentList6.add(stu9);
        List<Student> studentList7 = new ArrayList<Student>();
        studentList7.add(stu3);
        studentList7.add(stu5);
        studentList7.add(stu7);
        List<Student> studentList8 = new ArrayList<Student>();
        studentList8.add(stu6);
        studentList8.add(stu7);
        studentList8.add(stu8);
        studentList8.add(stu9);
        studentList8.add(stu10);

        course1.setStudent(studentList1);
        course2.setStudent(studentList2);
        course3.setStudent(studentList3);
        course4.setStudent(studentList4);
        course5.setStudent(studentList5);
        course6.setStudent(studentList6);
        course7.setStudent(studentList7);
        course8.setStudent(studentList8);


        CourseDAO courseDAO = new CourseDAOImpl();
        courseDAO.addCourses( course1);
        courseDAO.addCourses( course2);
        courseDAO.addCourses( course3);
        courseDAO.addCourses( course4);
        courseDAO.addCourses( course5);
        courseDAO.addCourses( course6);
        courseDAO.addCourses( course7);
        courseDAO.addCourses( course8);



    }

}
