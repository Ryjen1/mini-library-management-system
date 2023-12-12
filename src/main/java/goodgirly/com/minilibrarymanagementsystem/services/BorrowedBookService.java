package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.repositories.BorrowedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BorrowedBookService {
    @Autowired
    private final BorrowedBooksRepository booksRepository;

    public BorrowedBookService(BorrowedBooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }
}
