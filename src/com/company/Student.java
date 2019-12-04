package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String firstname;
  private String lastname;
  private List<Books>books;
    private String phoneNumber;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        books = new ArrayList<>();
    }

    public List<Books> getBooks() {
        return books;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printBooks(Books books) {
        for (Books book : this.books) {
            System.out.println(book.getAutor() + "  " + book.getBook_name());
        }
    }

    public void printBooks() {
    }
}
