package org.example.services;

import org.example.SchoolModel.Applicant;
import org.example.SchoolModel.Student;

public interface PrincipalService {
    void admitStudent(Applicant applicant);
    void expelStudent(Student student);
}
