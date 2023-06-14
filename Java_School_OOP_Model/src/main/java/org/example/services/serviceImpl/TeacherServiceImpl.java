package org.example.services.serviceImpl;

import org.example.SchoolModel.*;
import org.example.services.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    private List<Course> coursesTaught = new ArrayList<>();
    private final Teacher teacher;
    private Student student;


    public TeacherServiceImpl(Teacher teacher) {
        this.teacher = teacher;

    }

    @Override
    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(teacher.getName() + " teaches " + course.getCourseId());
    }

    @Override
    public List<Course> getCoursesTaught(Teacher teacher) {
        for(Course course : coursesTaught){
            System.out.println(course.getCourseName());
        }
        return teacher.getCourses();
    }

    @Override
    public String createAssignment(Course course, Assignment assignment) {
        course.getAssignmentList().add(assignment);
        System.out.println(assignment.getAssignmentId() + " created by " + teacher.getName());
        return assignment.getAssignmentTitle();
    }

    @Override
    public int getTotalStrikes(Student student) {
        return student.getNoOfStrikes();
    }

    @Override
    public String createExam(Course course, Exam exam) {
        course.getExam();
        System.out.println(exam.getExamId() + " created by " + teacher.getName());
        return exam.getExamTitle();
    }

    @Override
    public void giveStrike(Student student) {
        student.setNoOfStrikes(student.getNoOfStrikes() + 1);
        System.out.println("you have been given 1 more strike");
    }
}
