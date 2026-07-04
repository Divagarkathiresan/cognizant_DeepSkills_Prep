package com.example.librarymanagement.Service;

import com.example.librarymanagement.Repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    
    public BookService(){
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void show() {
        System.out.println("Employee Service created");
        bookRepository.show();
    }
}