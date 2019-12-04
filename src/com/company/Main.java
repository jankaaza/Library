package com.company;

import com.company.interfaces.BooksHelper;
import com.company.interfaces.Impl.BooksHelperImpl;
import com.company.interfaces.Impl.NumberHelperImpl;
import com.company.interfaces.Impl.StudentsHelperImpl;
import com.company.interfaces.Impl.WhoImpl;
import com.company.interfaces.NumberHelper;
import com.company.interfaces.StudentsHelper;
import com.company.interfaces.Who;

public class Main {

    public static void main(String[] args) {
        // write your code here
    /* UserHelper u=new UserHelperImpl();
      u.getName("student");*/
        BooksHelper bh = new BooksHelperImpl();
        /*
        Student student = new Student("Adilbek","Ashimov");
        StudentsHelperImpl studentsHelper = new StudentsHelperImpl();
        studentsHelper.setStudent(student);
        Books book1=new Books();
        book1.setBook_name("Toolor kulaganda");
        studentsHelper.addBook(book1);
//        System.out.println(bh.getBooks("dss","sd").get(0).getAutor());
       /* for (Books book: bh.getBooks("","")){
            System.out.println(book.getBook_name());
        }*/
     //   System.out.println(student.getBooks().get(0).getBook_name());
     //   Who m=new WhoImpl();
      //  m.getWho("student");
        //  u.getName("administrator");
       // BooksHelper book=new BooksHelperImpl();
        NumberHelper numberHelper=new NumberHelperImpl();
        numberHelper.clickNumber();

      //  System.out.println(book.getBooks("g","k"));
    }
}
