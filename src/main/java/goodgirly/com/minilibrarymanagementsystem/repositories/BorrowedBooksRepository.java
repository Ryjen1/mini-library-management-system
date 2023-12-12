package goodgirly.com.minilibrarymanagementsystem.repositories;

import goodgirly.com.minilibrarymanagementsystem.entities.BorrowedBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BorrowedBooksRepository extends JpaRepository<BorrowedBooks,Integer> {
}
