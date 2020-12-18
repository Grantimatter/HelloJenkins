package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    private int id;
    private String first_name;
    private String last_name;
    private int birth_year;

    public Author() {
    }

    public Author(String first_name, String last_name, int birth_year) {
        this();
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_year = birth_year;
    }

    public Author(int id, String first_name, String last_name, int birth_year) {
        this(first_name, last_name, birth_year);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && birth_year == author.birth_year && Objects.equals(first_name, author.first_name) && Objects.equals(last_name, author.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, birth_year);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_year=" + birth_year +
                '}';
    }
}
