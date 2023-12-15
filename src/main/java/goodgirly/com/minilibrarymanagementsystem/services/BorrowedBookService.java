package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.entities.BorrowedBook;
import goodgirly.com.minilibrarymanagementsystem.entities.User;
import goodgirly.com.minilibrarymanagementsystem.repositories.BookRepository;
import goodgirly.com.minilibrarymanagementsystem.repositories.BorrowedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BorrowedBookService {
    private final BorrowedBookRepository borrowedBookRepository;
    private final UserService userService;
    private final BookRepository bookRepository;

    public BorrowedBookService(BorrowedBookRepository borrowedBookRepository, UserService userService, BookRepository bookRepository) {
        this.borrowedBookRepository = borrowedBookRepository;
        this.userService = userService;
        this.bookRepository = bookRepository;
    }

    public BorrowedBook borrowedBookByUser(User user, Book book){
        BorrowedBook borrowedBook = new BorrowedBook();
        borrowedBook.setBook(book);
        borrowedBook.setUser(user);
        return borrowedBookRepository.save(borrowedBook);
    }

    public List<Book> borrowedBooksByUser(Long userId, List<Long> booksId){
        User user = userService.findUserById(userId);
        List<Book> books = booksId.stream().map(bookId -> bookRepository.findById(bookId).get()).toList();
        BorrowedBook borrowedBook = new BorrowedBook();
        borrowedBook.setUser(user);
        for (Book book: books){
            borrowedBook.setBook(book);
            borrowedBookRepository.save(borrowedBook);
        }
        return borrowedBookRepository.findAllByUser(user).stream().map(BorrowedBook::getBook).toList();
    }

}
