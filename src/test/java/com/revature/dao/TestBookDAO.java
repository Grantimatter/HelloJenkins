package com.revature.dao;

import com.revature.dao.impl.BookDAO;
import com.revature.model.Author;
import com.revature.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestBookDAO{

    private static IBookDAO bookDAO = new BookDAO();

    @Test
    public void testInsert() {
        Book b1 = new Book("Oliver Twist", "Fiction", "Hard back", new Author("Charles", "Dickens", 1812));
        Book b2 = new Book("Illiad", "Fiction", "Soft Cover", new Author("Charles", null, -350));

        bookDAO.insert(b1);
        bookDAO.insert(b2);

        List<Book> bookList = bookDAO.getAll();

        for(Book b:bookList){
            System.out.println(b);
        }
    }
}
