package com.example.librarymanagement.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarymanagement.Models.Book;
import com.example.librarymanagement.Repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id){
        Optional<Book> book = bookRepository.findById(id);
        return book;
    }

    public Book updateBook(Integer id,Book book){
        Book Updatebook=bookRepository.findById(id).orElse(null);
        if(Updatebook != null){
            Updatebook.setBookName(book.getBookName());
            return bookRepository.save(Updatebook);
        }else{
            return null;
        }
        
    }

    public void deleteAll(){
        bookRepository.deleteAll();
    }
}