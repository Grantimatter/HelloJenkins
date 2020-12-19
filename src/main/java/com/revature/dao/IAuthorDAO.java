package com.revature.dao;

import com.revature.model.Author;

import java.util.List;

public interface IAuthorDAO {
    public void insert(Author author);
    public void update(Author author);
    public Author getAuthorById(int id);
    public List<Author> getAll();
}
