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
        books.add(books1);
        books.add(books2);
        return books;
    }



}
