package goodgirly.com.minilibrarymanagementsystem.repositories;

import goodgirly.com.minilibrarymanagementsystem.entities.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BorrowedBookRepository extends JpaRepository<BorrowedBook,Long> {
}
