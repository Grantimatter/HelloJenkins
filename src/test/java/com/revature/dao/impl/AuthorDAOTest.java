package com.revature.dao.impl;

import com.revature.dao.IAuthorDAO;
import com.revature.dao.IBookDAO;
import com.revature.model.Author;
import com.revature.model.Book;
import org.junit.jupiter.api.Test;

public class AuthorDAOTest {

    IAuthorDAO authorDAO = new AuthorDAO();
    IBookDAO bookDAO = new BookDAO();

    @Test
    public void insert() {
        Author dickens = new Author("Charles", "Dickens", 1812, null);
        Author homer = new Author("Homer", null, -350, null);
        //authorDAO.insert(dickens);
        //authorDAO.insert(homer);

        bookDAO.insert(new Book("Oliver Twist", "Fiction", "Hard back", dickens));
        bookDAO.insert(new Book("Illiad", "Fiction", "Soft cover8", homer));
    }

    @Test
    void update() {
    }

    @Test
    void getAuthorById() {
    }

    @Test
    void getAll() {
    }
}