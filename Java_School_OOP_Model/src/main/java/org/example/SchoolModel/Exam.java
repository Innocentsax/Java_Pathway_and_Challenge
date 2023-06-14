package org.example.SchoolModel;

import java.time.LocalDateTime;

public class Exam {
    private int examId;
    private String examTitle;
    private LocalDateTime examDate;

    public Exam(int examId, String examTitle, LocalDateTime examDate) {
        this.examId = examId;
        this.examTitle = examTitle;
        this.examDate = examDate;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examTitle='" + examTitle + '\'' +
                ", examDate=" + examDate +
                '}';
    }
}
