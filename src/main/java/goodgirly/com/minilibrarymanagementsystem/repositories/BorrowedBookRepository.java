package goodgirly.com.minilibrarymanagementsystem.repositories;

import goodgirly.com.minilibrarymanagementsystem.entities.BorrowedBook;
import goodgirly.com.minilibrarymanagementsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BorrowedBookRepository extends JpaRepository<BorrowedBook,Long> {
    List<BorrowedBook> findAllByUser(User user);
}
