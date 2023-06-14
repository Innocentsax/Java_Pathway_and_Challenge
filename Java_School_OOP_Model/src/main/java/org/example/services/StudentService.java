package org.example.services;

import org.example.SchoolModel.Assignment;
import org.example.SchoolModel.Course;
import org.example.SchoolModel.Exam;
import org.example.SchoolModel.Student;

import java.util.List;

public interface StudentService {
    String takeCourse(Course course);
    int getTotalNumberOfCoursesTaken(Student student);
    void takeExam(Course course, Exam exam);
    String submitAssignment(Assignment assignment, Course course);
    void payFees(double amount);
    List<Course> getCoursesTaken(Student student);
}
