package com.revature.dao.impl;

import com.revature.dao.IAuthorDAO;
import com.revature.model.Author;
import com.revature.util.HibernateUtility;
import org.hibernate.Session;

import java.util.List;

public class AuthorDAO implements IAuthorDAO {

    @Override
    public void insert(Author author) {
        Session session = HibernateUtility.getSession();

        session.save(author);
    }

    @Override
    public void update(Author author) {
        Session session = HibernateUtility.getSession();

        session.merge(author);
    }

    @Override
    public Author getAuthorById(int id) {
        Session session = HibernateUtility.getSession();
        Author author = session.get(Author.class, id);
        return null;
    }

    @Override
    public List<Author> getAll() {
        Session session = HibernateUtility.getSession();
        List<Author> authorList = session.createQuery("FROM Author").list();
        return authorList;
    }
}
