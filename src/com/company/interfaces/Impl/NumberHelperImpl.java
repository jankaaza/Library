package com.company.interfaces.Impl;

import com.company.Books;
import com.company.Student;
import com.company.interfaces.BooksHelper;
import com.company.interfaces.NumberHelper;
import com.company.interfaces.StudentBooks;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberHelperImpl implements NumberHelper {

    @Override
    public void clickNumber() {
        System.out.println("If you want to take books click: 1, If you want to turn in books click: 2");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 1) {
            Scanner input1 = new Scanner(System.in);
        System.out.println("Which book do you want ? ");
            String bookname = input1.nextLine();
            Books book1 = new Books();
            book1.setBook_name(bookname);
            BooksHelper booksHelper = new BooksHelperImpl();
            for (Books book : booksHelper.getBooks("fg", "")) {
               if (book1.getBook_name().equals(book.getBook_name())) {
                    System.out.println(" You  taked  book " + book.getBook_name());
                } else System.out.println("Isn't found");
                break;
            }
            }
            if(number==2) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Which book do you delete? ");
                String bookname1 = input2.nextLine();
                BooksHelper booksHelper1 = new BooksHelperImpl();
                Books book3 = new Books();
                book3.setBook_name(bookname1);
                //List<Books> books=new ArrayList<>();
                for (Books book : booksHelper1.getBooks("fg", "")) {
                   if( book.getBook_name().equals(book3.getBook_name()));
                    List<Books> books=new ArrayList<>();
                    books.add(book);
                    books.remove(book);

                    }
                System.out.println(" You turn in  Successfully  ");


                }
            }
        }

