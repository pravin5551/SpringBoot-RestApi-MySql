package com.springboot.revision.entities;

import javax.persistence.*;

@Entity
@Table(name = "BookName")
public class BookName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    int author_id;

    @Column(name = "author_name")
    String author_name;

    @Column(name = "Language")
    String Language;

    public BookName() {
    }

    public int getAuthor_id() {
        return author_id;
    }

    public BookName(int author_id, String author_name, String language) {
        this.author_id = author_id;
        this.author_name = author_name;
        Language = language;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    @Override
    public String toString() {
        return "BookName{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                ", Language='" + Language + '\'' +
                '}';
    }
}
