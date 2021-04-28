package com.springboot.revision.services;

import com.springboot.revision.entities.Books;
import com.springboot.revision.repo.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookServices {

    @Autowired
    private Dao dao;

    public Iterable<Books> getAllBooks() {
        return dao.findAll();
    }

    public Books getBookById(int id) {
        return dao.findById(id);
    }

    public Books getBookByName(String name){
        return dao.findByName(name);
    }

    public Books getBookByTitle(String title){
        return dao.findByTitle(title);
    }

    public Books deletBookById(int id){
        dao.deleteById(id);
        return null;
    }

    public Books addBok(Books b){
        return dao.save(b);
    }

    public Books updateBook(Books books, int bookId){

        books.setId(bookId);
        return  dao.save(books);
    }


}
