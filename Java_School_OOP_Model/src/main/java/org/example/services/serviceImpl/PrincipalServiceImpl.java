package org.example.services.serviceImpl;

import org.example.SchoolModel.Applicant;
import org.example.SchoolModel.School;
import org.example.SchoolModel.Student;
import org.example.services.PrincipalService;

import java.util.ArrayList;
import java.util.List;

public class PrincipalServiceImpl implements PrincipalService {
    private List<Applicant> applicants;
    private List<Student> students = new ArrayList<>();
    private School school;

    public PrincipalServiceImpl(School school) {
        this.school = school;
    }

    @Override
    public void admitStudent(Applicant applicant) {
        if(applicant.getAge() < 6 || applicant.getAge() > 18){

            applicants.remove(applicant);
            System.out.println(applicant.getName() + " does not meet the age requirement for admission");
        }else {
            Student student = new Student(applicant.getId(), applicant.getName(), applicant.getAge(), applicant.getWallet());
            students.add(student);
            System.out.println(students);
            System.out.println(applicant.getName() + " is now a student of " + school.getName());
        }
    }

    @Override
    public void expelStudent(Student student) {
        if(student.getNoOfStrikes() == 3){
            students.remove(student);
            System.out.println(student.getName() + " is no longer a student of" + school.getName());
        }
    }
}
