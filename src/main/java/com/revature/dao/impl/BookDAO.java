package com.revature.dao.impl;

import com.revature.dao.IBookDAO;
import com.revature.model.Book;
import com.revature.util.HibernateUtility;
import org.hibernate.Session;

import java.util.List;

public class BookDAO implements IBookDAO {
    @Override
    public void insert(Book book) {
        Session session = HibernateUtility.getSession();

        session.save(book);
    }

    @Override
    public void update(Book book) {
        Session session = HibernateUtility.getSession();

        session.merge(book);
    }

    @Override
    public Book getBookById(int id) {
        Session session = HibernateUtility.getSession();
        Book book = session.get(Book.class, id);
        return null;
    }

    @Override
    public List<Book> getAll() {
        Session session = HibernateUtility.getSession();
        List<Book> bookList = session.createQuery("FROM Book").list();
        return bookList;
    }
}
