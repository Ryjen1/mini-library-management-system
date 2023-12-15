package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.repositories.BorrowedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BorrowedBookService {
    @Autowired
    private final BorrowedBookRepository booksRepository;

    public BorrowedBookService(BorrowedBookRepository booksRepository) {
        this.booksRepository = booksRepository;
    }
}
