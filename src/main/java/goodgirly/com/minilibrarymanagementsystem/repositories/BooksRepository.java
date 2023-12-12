package goodgirly.com.minilibrarymanagementsystem.repositories;

import goodgirly.com.minilibrarymanagementsystem.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface BooksRepository extends JpaRepository<Books,Integer> {
}
