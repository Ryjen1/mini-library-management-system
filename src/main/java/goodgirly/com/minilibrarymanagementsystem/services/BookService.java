package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.dto.BooksBorrowedByUserRequest;
import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.entities.User;
import goodgirly.com.minilibrarymanagementsystem.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService {
    private final BookRepository bookRepository;
    private final UserService userService;
    private final BorrowedBookService borrowedBookService;

    public BookService(BookRepository bookRepository, UserService userService, BorrowedBookService borrowedBookService) {
        this.bookRepository = bookRepository;
        this.userService = userService;
        this.borrowedBookService = borrowedBookService;
    }

    public Book addBook(Book newBook){
        return bookRepository.save(newBook);
    }

    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

}
