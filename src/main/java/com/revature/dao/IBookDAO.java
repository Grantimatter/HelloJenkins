package com.revature.dao;

import com.revature.model.Book;

import java.util.List;

public interface IBookDAO {
    public void insert(Book book);
    public void update(Book book);
    public Book getBookById(int id);
    public List<Book> getAll();
}
