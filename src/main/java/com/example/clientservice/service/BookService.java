package com.example.clientservice.service;

import com.example.clientservice.connector.BookServiceConnector;
import com.example.clientservice.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookService {

    private BookServiceConnector bookServiceConnector;

    public BookService(BookServiceConnector bookServiceConnector) {
        this.bookServiceConnector = bookServiceConnector;
    }

    public List<Book> getAllBooksByFeign() {
        return bookServiceConnector.getAllBooksList();
    }

}

