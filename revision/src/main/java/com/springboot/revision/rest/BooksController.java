package com.springboot.revision.rest;


import com.springboot.revision.entities.Books;
import com.springboot.revision.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class BooksController {

    @Autowired
    public BookServices bookServices;

    @Autowired
    public BooksController(BookServices bookServices){
        this.bookServices=bookServices;
    }

    @GetMapping("/allBooks")
    public Iterable<Books> getAllBooks(){
        return bookServices.getAllBooks();
    }

    @GetMapping("/getbookbyId/{bookId}")
    public  Books getBookById(@PathVariable int bookId){
        return bookServices.getBookById(bookId);
    }
    @GetMapping("/getBookByName/{bookName}")
    public Books getBookById(@PathVariable String bookName){
        return bookServices.getBookByName(bookName);
    }


    @PostMapping("/books")
    public Books addBook(@RequestBody Books thebook){
        thebook.setId(0);
        bookServices.addBok(thebook);
        return thebook;
    }

    @DeleteMapping("/deleteBook/{bookid}")
    public Books deletBookById(@PathVariable("bookid") int bookid){
        return bookServices.deletBookById(bookid);
    }

    @PutMapping("/updateById/{bookId}")
    public Books updateBookById(@RequestBody Books book,@PathVariable("bookId") int bookId){
        return bookServices.updateBook(book,bookId);
    }

}

