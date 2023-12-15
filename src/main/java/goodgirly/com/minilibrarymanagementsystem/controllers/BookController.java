package goodgirly.com.minilibrarymanagementsystem.controllers;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public Book addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }
    @GetMapping
    public List<Book> getBooks(){
        return bookService.findBooks();
    }
}
