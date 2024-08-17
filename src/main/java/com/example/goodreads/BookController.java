package com.example.goodreads;

import org.springframework.web.bind.annotation.*;
import com.example.goodreads.BookService;
import java.util.*;
import com.example.goodreads.*;

@RestController
class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookId(@PathVariable("bookId") int bookId) {
        return bookService.getBookById(bookId);
    }
}