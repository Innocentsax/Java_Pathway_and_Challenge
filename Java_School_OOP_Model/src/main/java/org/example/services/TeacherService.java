package org.example.services;

import org.example.SchoolModel.*;

import java.util.List;

public interface TeacherService {
    void teachCourse(Course course);
    List<Course> getCoursesTaught(Teacher teacher);
    String createAssignment(Course course, Assignment assignment);
    int getTotalStrikes(Student student);
    String createExam(Course course, Exam exam);
    void giveStrike(Student student);
}
