package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
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
