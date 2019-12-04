package com.company.interfaces;

import com.company.Books;
import java.util.List;

public interface BooksHelper {
    List<Books> getBooks(String autor, String name);

}
