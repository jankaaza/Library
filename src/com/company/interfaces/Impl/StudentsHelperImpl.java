package com.company.interfaces.Impl;

import com.company.Books;
import com.company.Student;
import com.company.interfaces.StudentsHelper;

import java.util.ArrayList;
import java.util.List;

public class StudentsHelperImpl implements StudentsHelper {

    private Student student;
    public void addBook(Books book){
        student.getBooks().add(book);
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }


    @Override
    public List createStudent(String firstname, String lastname) {
        List<Student> students=new ArrayList<>();
        Student student1=new Student("Janargul ","Azamat kyzy");
        Student student2=new Student("Yrysgul ","Ysmanova");
        Student student3=new Student("Aiperi ","AKIM  kyzy");
        Student student4=new Student("Mayramkan","Asanbaeva");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        return (List) students;
    }



}
