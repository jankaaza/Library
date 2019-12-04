package com.company.interfaces.Impl;

import com.company.Books;
import com.company.Student;
import com.company.interfaces.BooksHelper;
import com.company.interfaces.NumberHelper;
import com.company.interfaces.StudentsHelper;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberHelperImpl implements NumberHelper {

    @Override
    public void clickNumber() {
        System.out.println("If you want to take books click: 1, If you want to turn in books click: 2");
        Scanner input = new Scanner(System. in);
        Scanner input1 = new Scanner(System. in);
        int number = input. nextInt();
        String bookname=input1.nextLine();
        if(number==1){
          Books book1=new Books();
          book1.setBook_name(bookname);
          BooksHelper booksHelper=new BooksHelperImpl();
          for(Books book: booksHelper.getBooks("fg",""))


          System.out.println("aldi"+ book1.getBook_name());

          //else System.out.println(book.getBook_name());

        }

    }
}
