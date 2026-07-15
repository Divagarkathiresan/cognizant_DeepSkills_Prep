package com.example.librarymanagement.Repository;
import com.example.librarymanagement.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
