package com.company.interfaces.Impl;

import com.company.Books;
import com.company.Student;
import com.company.interfaces.BooksHelper;
import com.company.interfaces.NumberHelper;
import com.company.interfaces.StudentsHelper;
import com.company.interfaces.Who;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;
import java.util.Scanner;

public class WhoImpl implements Who {
    @Override
    public void getWho(String name) {
        Scanner input2 = new Scanner(System.in);

        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        System.out.println("Who: ");
        name = input2.nextLine();

        if (name.equals("student")) {
            System.out.println("What is your name?");
            String name1 = input3.nextLine();
            System.out.println("What is your surname?");
            String name2 = input4.nextLine();
            StudentsHelperImpl studentsHelper = new StudentsHelperImpl();
            Student student = new Student(name1, name2);
            studentsHelper.setStudent(student);
            //  System.out.println("What is your name? " + studentsHelper.getStudent().getFirstname() +"  "+studentsHelper.getStudent().getLastname());
            if (!studentsHelper.getStudent().getFirstname().isEmpty()) {
                NumberHelper numberHelper = new NumberHelperImpl();
                numberHelper.clickNumber();

            }
        } else if (name.equals("administrator")) {
            System.out.println("If you want to see student list then click 1,if you want to see booklist then click 2?");
            Scanner input5 = new Scanner(System.in);
            int number5 = input5.nextInt();
            if (number5 == 1) {
                System.out.println(" Students List and books ");
                ArrayList<Books> books = new ArrayList<>();
                Books book1 = new Books();
                book1.setBook_name("Erte kelgen turnalar");
                Books book2 = new Books();
                book2.setBook_name("Bogatyi papa");
                Books book3 = new Books();
                book3.setBook_name("Kurinnii bulon");
                Books book4 = new Books();
                book4.setBook_name("Papagan");
                books.add(book1);
                books.add(book2);
                books.add(book3);
                books.add(book4);
                StudentsHelper studentsHelper = new StudentsHelperImpl();
                for (Student student : studentsHelper.createStudent("cxs", "sc")) {
                    System.out.print(student.getFirstname() + " " + student.getLastname() + " :   ");
                    student.setBooks(books);
                    for (Books book : books)
                        System.out.println(" " + " ' " + book.getBook_name() + " ' ");
                    // System.out.println();
                }
            } else if (number5 == 2) {
                System.out.println(" Book List ");
                BooksHelper booksHelper = new BooksHelperImpl();
                for (Books book : booksHelper.getBooks("sdcv", "aca")) {
                    System.out.println(book.getAutor()+" : ' " + book.getBook_name() + " ' - "  );
                }
            }
        }

    }
}// else System.out.println("Errror");

