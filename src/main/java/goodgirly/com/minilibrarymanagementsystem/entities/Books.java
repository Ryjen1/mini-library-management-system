package goodgirly.com.minilibrarymanagementsystem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "book")

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    @Column(unique = true)
    private String ISBN;

    private int publicationYear;

    @OneToMany(mappedBy = "book")
    private List<BorrowedBooks> borrowedBy;
}
