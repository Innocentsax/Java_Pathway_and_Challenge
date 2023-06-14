package org.example.SchoolModel;

import java.time.LocalDateTime;

public class Assignment {
    private int assignmentId;
    private String assignmentTitle;
    private LocalDateTime givenDate;
    private LocalDateTime dueDate;
    private Course course;

    public Assignment(int assignmentId, String assignmentTitle, LocalDateTime givenDate, LocalDateTime dueDate) {
        this.assignmentId = assignmentId;
        this.assignmentTitle = assignmentTitle;
        this.givenDate = givenDate;
        this.dueDate = dueDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public LocalDateTime getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(LocalDateTime givenDate) {
        this.givenDate = givenDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", givenDate=" + givenDate +
                ", dueDate=" + dueDate +
                '}';
    }
}
