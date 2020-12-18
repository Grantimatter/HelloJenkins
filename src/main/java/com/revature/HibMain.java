package com.revature;

import com.revature.dao.IBookDAO;
import com.revature.dao.impl.BookDAO;
import com.revature.model.Author;
import com.revature.model.Book;

import java.util.List;

public class HibMain {
    private static IBookDAO bookDAO = new BookDAO();

    public static void main(String[] args) {
        testInsert();
    }

    public static void testInsert() {
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
