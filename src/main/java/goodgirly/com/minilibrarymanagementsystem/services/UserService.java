package goodgirly.com.minilibrarymanagementsystem.services;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.entities.BorrowedBook;
import goodgirly.com.minilibrarymanagementsystem.entities.User;
import goodgirly.com.minilibrarymanagementsystem.repositories.BorrowedBookRepository;
import goodgirly.com.minilibrarymanagementsystem.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository usersRepository;
    private final BorrowedBookRepository borrowedBookRepository;

    public UserService(UserRepository usersRepository, BorrowedBookRepository borrowedBookRepository) {
        this.usersRepository = usersRepository;
        this.borrowedBookRepository = borrowedBookRepository;
    }

    public List<Book> findBorrowedBooksByUserId(Long id) {
        User user = usersRepository.findById(id).get();
        List<BorrowedBook> borrowedBooks = borrowedBookRepository.findAllByUser(user);
        return borrowedBooks.stream().map(BorrowedBook::getBook).toList();
    }

    public User findUserById(Long id){
        return usersRepository.findById(id).get();
    }

    public List<User> findUsers() {
        return usersRepository.findAll();
    }
}
