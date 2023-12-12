package goodgirly.com.minilibrarymanagementsystem.controllers;

import goodgirly.com.minilibrarymanagementsystem.services.BookService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    private BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
}
