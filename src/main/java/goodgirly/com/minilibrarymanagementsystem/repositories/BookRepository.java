package goodgirly.com.minilibrarymanagementsystem.repositories;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findBookByTitle(String title);
}
