package com.company.interfaces.Impl;

import com.company.Books;
import com.company.interfaces.BooksHelper;

import java.util.ArrayList;
import java.util.List;

public class BooksHelperImpl implements BooksHelper {



    @Override
    public List<Books> getBooks(String autor, String name) {
      //  List<Books> book=new ArrayList<>();
//Books books=new Books();
//books.setAutor("Chyngyz Aytmatov  ");
//books.setBook_name(" Toolor kulaganda  ");

 //       return books.getAutor()+"  "+ books.getBook_name();
        ArrayList<Books> books = new ArrayList<>();
        Books books1 = new Books();
        books1.setBook_name("Jamilya");
        books1.setAutor("Chyngyz Aytmatov");
        Books books2 = new Books();
        books2.setBook_name("Toolor kulaganda");
        books2.setAutor("Chyngyz Aytmatov");
        Books books3 = new Books();
        books3.setBook_name("RomeoJuliet");
        books3.setAutor("William Shakespeare");
        Books books4 = new Books();
        books4.setBook_name("Evgenii Onegin");
        books4.setAutor("Aleksandr Pushkin");
        Books books5 = new Books();
        books5.setBook_name("For children");
        books5.setAutor("Alykul Osmonov");
        Books books6 = new Books();
        books6.setBook_name("The story of king");
        books6.setAutor("William Shakespeare");
        books.add(books1);
        books.add(books2);
        books.add(books3);
        books.add(books4);
        books.add(books5);
        books.add(books6);

        return books;
    }



}
