package com.company.interfaces;

import com.company.Books;
import com.company.Student;

import java.util.List;

public interface StudentBooks {
    List<Books> getstudentBook(Student student);
}
