package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.entities.Books;
import goodgirly.com.minilibrarymanagementsystem.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BookService {
    @Autowired
    private final BooksRepository booksRepository;

    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

}
