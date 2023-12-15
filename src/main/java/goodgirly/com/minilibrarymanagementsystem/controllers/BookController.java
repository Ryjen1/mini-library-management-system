package goodgirly.com.minilibrarymanagementsystem.controllers;

import goodgirly.com.minilibrarymanagementsystem.dto.BooksBorrowedByUserRequest;
import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

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
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id){
        return bookService.findBookById(id);
    }
    @GetMapping("/title/{title}")
    public Book getBookByTitle(@PathVariable("title") String title){
        return bookService.findBookByTitle(title);
    }


}
