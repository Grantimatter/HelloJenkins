package com.revature.dao;

import com.revature.dao.impl.BookDAO;
import com.revature.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestGetBooks {

    private IBookDAO bookDAO = new BookDAO();

    @Test
    public void testGetAllBooks(){
        List<Book> bookList = bookDAO.getAll();

        for(Book b:bookList){
            System.out.println(b);
        }
    }
}
