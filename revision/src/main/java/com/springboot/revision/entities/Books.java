package com.springboot.revision.entities;




import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    int id;

    @Column(name="book_name")
    String name;

    @Column(name="title")
    String title;

    public Books() {
    }

    public Books(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
