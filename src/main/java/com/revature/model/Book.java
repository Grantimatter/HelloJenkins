package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private int id;
    @Column(name="book_title", nullable = false)
    private String title;
    @Column(name="book_category", nullable = false)
    private String category;
    @Column(name="book_binding", nullable = false)
    private String binding;

    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="author_id")
    private Author author;

    public Book() {
    }

    public Book(String title, String category, String binding, Author author) {
        this();
        this.title = title;
        this.category = category;
        this.binding = binding;
        this.author = author;
    }

    public Book(int id, String title, String category, String binding, Author author) {
        this(title, category, binding, author);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(title, book.title) && Objects.equals(category, book.category) && Objects.equals(binding, book.binding) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, category, binding, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", binding='" + binding + '\'' +
                ", author=" + author +
                '}';
    }
}
