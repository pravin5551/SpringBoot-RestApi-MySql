package com.springboot.revision.entities;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    int id;

    @OneToOne(cascade = CascadeType.ALL)
    BookName name;

    String title;

    public Books() {
    }

    public int getId() {
        return id;
    }

    public BookName getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(BookName name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Books( BookName name, String title) {

        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name=" + name +
                ", title='" + title + '\'' +
                '}';
    }
}
