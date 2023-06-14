package org.example.services.serviceImpl;

import org.example.SchoolModel.*;
import org.example.services.StudentService;
import org.example.services.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final Student student;
    private List<Exam> exams = new ArrayList<>();
    private School school;
    private final TeacherService teacherService;
    private final Course course;
    private final Assignment assignment;

    public StudentServiceImpl(Student student, TeacherService teacherService, Course course, Assignment assignment) {
        this.student = student;
        this.course = course;
        this.teacherService = teacherService;

        this.assignment = assignment;
    }

    @Override
    public String takeCourse(Course course) {
        student.getCourses().add(course);
        return course.getCourseName();
    }

    @Override
    public int getTotalNumberOfCoursesTaken(Student student) {
        return getCoursesTaken(student).size();
    }

    @Override
    public void takeExam(Course course, Exam exam) {
        if(!student.getCourses().contains(course)){
            System.out.println(student.getName() + ", you can not access " + exam.getExamId());
        }else{
            exams.add(exam);
            System.out.println(student.getName()+" you can take "+ exam.getExamId());
        }
    }

    @Override
    public String submitAssignment(Assignment assignment, Course course) {
        if(!student.getCourses().contains(course)){
            System.out.println("this assignment was not assigned to you");
        }else{
            System.out.println(" you have successfully submitted "+ assignment.getAssignmentTitle());
        }
        return "submitted";
    }

    @Override
    public void payFees(double amount) {
        if (student.getWallet() >= amount) {
            student.setWallet(student.getWallet() - amount);
            System.out.println("fees successfully paid");
            System.out.println(student.getWallet());
        }else
            System.out.println("amount in wallet not sufficient");
    }
    @Override
    public List<Course> getCoursesTaken(Student student) {
        return new ArrayList<>(student.getCourses());
    }
}
