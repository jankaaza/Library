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
        System.out.println("What is your name?");
        String name1=input3.nextLine();
        System.out.println("What is your surname?");
        String name2=input4.nextLine();
        if (name.equals("student")) {
            StudentsHelperImpl studentsHelper=new StudentsHelperImpl();
            Student student=new Student(name1,name2);
            studentsHelper.setStudent(student);
          //  System.out.println("What is your name? " + studentsHelper.getStudent().getFirstname() +"  "+studentsHelper.getStudent().getLastname());
            if(!studentsHelper.getStudent().getFirstname().isEmpty()){
                NumberHelper numberHelper=new NumberHelperImpl();
                numberHelper.clickNumber();

            }
        }
        else if (name.equals("administrator")) {
            System.out.println(" Students List ");
            ArrayList<Books>books=new ArrayList<>();
            Books book1=new Books();
            book1.setBook_name("Erte kelgen turnalar");
            Books book2=new Books();
            book2.setBook_name("Bogatyi papa");
            Books book3=new Books();
            book3.setBook_name("Kurinnii bulon");
            Books book4=new Books();
            book4.setBook_name("Papagan");
            books.add(book1);
            books.add(book2);
            books.add(book3);
            books.add(book4);
            StudentsHelper studentsHelper=new StudentsHelperImpl();
          for(Student student : studentsHelper.createStudent("cxs","sc")){
              System.out.print(student.getFirstname()+ " " + student.getLastname()+ " :   ");
                  student.setBooks(books);
                  for(Books book:books)
            System.out.print("  --" + " ' "+ book.getBook_name()+ " ' ");
              System.out.println();
            }
            System.out.println(" Book List ");
            BooksHelper booksHelper=new BooksHelperImpl();
            for(Books book:booksHelper.getBooks("sdcv","aca")){
            System.out.println(" ' "+ book.getBook_name()+ " ' - " +book.getAutor());
            }
          }

        }// else System.out.println("Errror");

}