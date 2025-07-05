package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
        private BookRepository book;
        private String name;

        // constructor injection
        public BookService(String name) {
            this.name = name;
            System.out.println("Constructor Injection: serviceName = " + name);
        }
        // setter injection
        public void setBookRepository(BookRepository book) {
            this.book = book;
            System.out.println("Setter Injection completed");
        }
        public void addBook(String title) {
            System.out.println("[" + name + "] Adding book: " + title);
            book.saveBook(title);
        }
    }
