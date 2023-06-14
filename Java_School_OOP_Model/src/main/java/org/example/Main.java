package org.example;

import org.example.SchoolModel.*;
import org.example.services.PrincipalService;
import org.example.services.StudentService;
import org.example.services.TeacherService;
import org.example.services.serviceImpl.PrincipalServiceImpl;
import org.example.services.serviceImpl.StudentServiceImpl;
import org.example.services.serviceImpl.TeacherServiceImpl;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Applicant applicant = new Applicant(1, "applicant", 7, 0.00);

        Student student1 = new Student(11, "student1", 7, 20000);


        Teacher teacher = new Teacher(1,"teacher1", 21, 5000);

        Course course = new Course(1, "course1", 4, teacher);
        Assignment assignment = new Assignment(1, "Math Homework", LocalDateTime.now(), LocalDateTime.now().plusDays(2));

        // Set the course for the assignment

        Principal principal = new Principal(1, "principal", 45, 10000);
        School school = new School("school", principal);

        Exam exam = new Exam(1, "fashion", LocalDateTime.now().plusDays(14));

        TeacherService teacherService = new TeacherServiceImpl(teacher);
        teacherService.teachCourse(course);
        teacherService.createAssignment(course, assignment);
        teacherService.createExam(course, exam);
        teacherService.giveStrike(student1);
        teacherService.giveStrike(student1);
        teacherService.giveStrike(student1);
        teacherService.getCoursesTaught(teacher);

        PrincipalService principalService = new PrincipalServiceImpl(school);
        principalService.admitStudent(applicant);


        student1.getCourses().add(course);

        StudentService studentService = new StudentServiceImpl(student1, teacherService,course,assignment);
        studentService.takeCourse(course);
        studentService.takeExam(course, exam);
        studentService.getTotalNumberOfCoursesTaken(student1);
        studentService.submitAssignment(assignment, course);
        studentService.payFees(15000.00);




    }
}