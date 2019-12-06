package com.company;

import com.company.interfaces.*;
import com.company.interfaces.Impl.*;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        Who who=new WhoImpl();
        who.getWho("administrator");
       /* StudentBooks studentBooks =new StudentBooksImpl();
        Student st=new Student("Janargul","Azamat kyzy");
       studentBooks.getstudentBook(st)
            System.out.println( studentBooks.getstudentBook(st));*/



    }
}
