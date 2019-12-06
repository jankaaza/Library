package com.company;

import java.util.Date;

public class Books {
    private String autor;
    private String book_name;
    private int CreateDate;
    private int pageSize;

    public int getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(int createDate) {
        CreateDate = createDate;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }



}
