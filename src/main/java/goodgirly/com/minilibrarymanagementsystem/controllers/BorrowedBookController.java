package goodgirly.com.minilibrarymanagementsystem.controllers;

import goodgirly.com.minilibrarymanagementsystem.dto.BooksBorrowedByUserRequest;
import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.entities.BorrowedBook;
import goodgirly.com.minilibrarymanagementsystem.services.BorrowedBookService;
import goodgirly.com.minilibrarymanagementsystem.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/{id}/borrowed-books")
public class BorrowedBookController {

    private final UserService userService;
    private final BorrowedBookService borrowedBookService;

    public BorrowedBookController(UserService userService, BorrowedBookService borrowedBookService) {
        this.userService = userService;
        this.borrowedBookService = borrowedBookService;
    }

    @GetMapping
    public List<Book> getBorrowedBooksByUserId(@PathVariable("id") Long id){
        return userService.findBorrowedBooksByUserId(id);
    }
    @PostMapping
    public List<Book> setBorrowedBooksByUserId(@PathVariable("id") Long id, @RequestBody List<Long> booksId){
        return borrowedBookService.borrowedBooksByUser(id,booksId);
    }
}
