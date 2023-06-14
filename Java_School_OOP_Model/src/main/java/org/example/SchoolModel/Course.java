package org.example.SchoolModel;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private int totalNumberOfStudents;
    private Teacher teacher;
    private List<Assignment> assignmentList = new ArrayList<>();
    private Exam exam;


    public Course(int courseId, String courseName, int totalNumberOfStudents, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.totalNumberOfStudents = totalNumberOfStudents;
        this.teacher = teacher;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTotalNumberOfStudents() {
        return totalNumberOfStudents;
    }

    public void setTotalNumberOfStudents(int totalNumberOfStudents) {
        this.totalNumberOfStudents = totalNumberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", totalNumberOfStudents=" + totalNumberOfStudents +
                '}';
    }
}
