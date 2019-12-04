package com.company;

import java.util.ArrayList;
import java.util.List;

public class Administrator {
    public String first_name;
   public String last_name;
    private List<Student> students;
    private List<Books> books;

    public Administrator(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Administrator(List<Student> students, List<Books> books) {
        this.students = students;
        this.books = books;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if (this.students == null) {
            this.students = new ArrayList<>();
        }
        this.students.add(student);
    }

    public List<Books> getBooks() {
        return books;
    }

    public void addBooks(Books book) {
        if (this.books == null) {
            this.books = new ArrayList<>();
        }
        this.books.add(book);
    }

    public void setBooks(List<Books> books) {
        this.books = books;

    }

    public void printStudents() {
        for (Student student : this.students) {
            System.out.println(student.getFirstname() + "  " + getLast_name());
        }
    }
    public void printBooks() {
        for (Books book : this.books) {
            System.out.println(book.getAutor() + "  " + book.getBook_name());
        }
    }
}


