package com.company.interfaces.Impl;

import com.company.Student;
import com.company.interfaces.Who;

public class WhoImpl implements Who {
    @Override
    public void getWho(String name) {
        if (name == "student") {
            StudentsHelperImpl studentsHelper=new StudentsHelperImpl();
            Student student=new Student("Janargul","Azamat kyzy");
            studentsHelper.setStudent(student);
            System.out.println("What is your name? " + studentsHelper.getStudent().getFirstname());

        } else if (name == "administrator ") {
            System.out.println("What is your name? ");
        } else System.out.println("Errror");
    }
}