package com.example.librarymanagement.Controller;

import com.example.librarymanagement.Repository.BookRepository;

import java.net.http.HttpResponse.ResponseInfo;
import java.util.*;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.Models.Book;
import com.example.librarymanagement.Service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/post")
    public ResponseEntity<?> addNewBook(@RequestBody Book book) {
        Book savedBook=bookService.saveBook(book);
        return ResponseEntity.status(201).body(savedBook);
    }
    
    @GetMapping("/allBooks")
    public ResponseEntity<?> getAllBooks(){
        List<Book> books=bookService.getAllBooks();
        return ResponseEntity.status(200).body(books);
    }

    @GetMapping("/BookId/{Id}")
    public ResponseEntity<?> getBookById(@PathVariable Integer Id){
        Optional<Book> book=bookService.getBookById(Id);
        if(book.isPresent()) return ResponseEntity.status(200).body(book);
        else return ResponseEntity.status(404).body("Not Found");
    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Integer id,@RequestBody Book book){
        Book updateBook=bookService.updateBook(id, book);
        if(updateBook != null) return ResponseEntity.status(200).body(updateBook);
        else return ResponseEntity.status(404).body("Not Found "+id);
    }
    
    @DeleteMapping("/deleteAll")
    public ResponseEntity<?> deleteAllBooks(){
        bookService.deleteAll();
        return ResponseEntity.status(200).body("Deleted all the books from the DB");
    }
}
