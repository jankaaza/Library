package com.company.interfaces.Impl;

import com.company.Student;
import com.company.interfaces.UserHelper;

public class UserHelperImpl implements UserHelper {

    @Override
    public void getName(String name) {
        if (name == "student") {
           // BooksHelper books=new BooksHelperImpl();
            Student student =new Student(" Janargul "," Azamat kyzy");
          //String book1= books.getBooks("nksj","kj");
          //  System.out.println(book1);
            System.out.println("What is your name?  "+ student.getFirstname() +" " + student.getLastname() );

       //     Scanner input = new Scanner(System. in);
         //   int number = input. nextInt();
          //  System.out.println("Esli hochesh vzyad knigu najmi 1"+number);
     //       if(number==1){
              //  BooksHelper books=new BooksHelperImpl();
           //     System.out.println(books.getBooks("io","sdv"));
          //  }


           // if(name=="administrator"){
            //    System.out.println();
          //  }
         //   Student student = null;
          //  System.out.println(student.getFirstname() + student.getLastname() + student.getPhoneNumber());
        }
    }


}
