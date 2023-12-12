package goodgirly.com.minilibrarymanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "borrowed_book")

public class BorrowedBooks {
    @OneToMany
    @JoinColumn(name = "userId")
    private int userId;
    @OneToMany
    @JoinColumn(name = "bookId")

    private String bookName;
    private String bookAuthor;
}
