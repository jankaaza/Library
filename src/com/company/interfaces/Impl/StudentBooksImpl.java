package com.company.interfaces.Impl;

import com.company.Books;
import com.company.Student;
import com.company.interfaces.StudentBooks;

import java.util.ArrayList;
import java.util.List;

public class StudentBooksImpl implements StudentBooks {
    @Override
    public List<Books> getstudentBook(Student student) {
        List<Books> books=new ArrayList<>();
        Books book1=new Books();
        book1.setBook_name("Erte kelgen turnalar");
        Books book2=new Books();
        book2.setBook_name("Kizil Jooluk Jaljalym");
        books.add(book1);
        books.add(book2);

        return books;
    }
}
