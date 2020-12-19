package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
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

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private List<Book> bibliography;

    public Author() {
        super();
    }

    public Author(String first_name, String last_name, int birth_year, List<Book> bibliography) {
        this();
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_year = birth_year;
        this.bibliography = bibliography;
    }

    public Author(int id, String first_name, String last_name, int birth_year, List<Book> bibliography) {
        this(first_name, last_name, birth_year, bibliography);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public List<Book> getBibliography() {
        return bibliography;
    }

    public void setBibliography(List<Book> bibliography) {
        this.bibliography = bibliography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && birth_year == author.birth_year && Objects.equals(first_name, author.first_name) && Objects.equals(last_name, author.last_name) && Objects.equals(bibliography, author.bibliography);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, birth_year, bibliography);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_year=" + birth_year +
                ", bibliography=" + bibliography +
                '}';
    }
}
