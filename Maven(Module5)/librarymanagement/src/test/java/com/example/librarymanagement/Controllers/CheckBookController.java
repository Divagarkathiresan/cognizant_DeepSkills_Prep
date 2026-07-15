package com.example.librarymanagement.Controllers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.example.librarymanagement.Controller.BookController;
import com.example.librarymanagement.Models.Book;
import com.example.librarymanagement.Service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;


@WebMvcTest(BookController.class)
public class CheckBookController {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void shouldSaveBook() throws Exception{
        Book book=new Book(1,"White Nights");
        when(bookService.saveBook(any(Book.class))).thenReturn(book);

        mockMvc.perform(post("/books/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(book)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.bookId").value(1))
                .andExpect(jsonPath("$.bookName").value("White Nights"));
    }

    @Test
    public void shouldReturnBooks() throws Exception{
        Book book1=new Book(1,"White Nights");
        Book book2=new Book(2,"Starry");
        List<Book> list=Arrays.asList(book1,book2);
        when(bookService.getAllBooks()).thenReturn(list);

        mockMvc.perform(get("/books/allBooks"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].bookName").value("White Nights"));
    }


    @Test
    public void shouldReturnOneBook() throws Exception{
        Book book=new Book(1,"White Nights");
        when(bookService.getBookById(1)).thenReturn(Optional.of(book));

        mockMvc.perform(get("/books/BookId/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.bookName").value("White Nights"));
    }

}