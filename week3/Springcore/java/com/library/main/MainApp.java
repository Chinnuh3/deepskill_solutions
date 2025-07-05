package com.library.main;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
        public static void main(String[] args) {
            ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
            BookService b = c.getBean("bookService", BookService.class);
            b.addBook("Java Enterprise Edition");
        }
        }

