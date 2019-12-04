package com.company;

public abstract class User {
   private String firstname;
   private String Lastname;
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        Lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public abstract boolean getFirst_name();
}
