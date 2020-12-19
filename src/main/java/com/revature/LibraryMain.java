package com.revature;

import com.revature.dao.IAuthorDAO;
import com.revature.dao.IBookDAO;
import com.revature.dao.impl.AuthorDAO;
import com.revature.dao.impl.BookDAO;
import com.revature.model.Author;
import com.revature.model.Book;

import java.util.List;

public class LibraryMain {

    private static IBookDAO bookDAO = new BookDAO();
    private static IAuthorDAO authorDAO = new AuthorDAO();

    public static void main(String[] args) {
        Author dickens = new Author("Charles", "Dickens", 1812, null);
        Author homer = new Author("Homer", null, -350, null);
        Author tolkien = new Author("J.R.R.", "Tolkien", 1892, null);

        //authorDAO.insert(dickens);
        //authorDAO.insert(homer);

        authorDAO.insert(tolkien);

        bookDAO.insert(new Book("Oliver Twist", "Fiction", "Hard back", dickens));
        bookDAO.insert(new Book("Illiad", "Fiction", "Soft cover", homer));
        bookDAO.insert(new Book("The Lord of the Rings", "Fiction", "Hard back", tolkien));

        List<Book> bookList = bookDAO.getAll();
        List<Author> authorList = authorDAO.getAll();

        for(Book b:bookList){
            System.out.println(b);
        }
        for(Author a:authorList){
            System.out.println(a);
        }
    }
}
