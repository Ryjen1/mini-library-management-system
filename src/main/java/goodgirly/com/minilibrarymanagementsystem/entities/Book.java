package goodgirly.com.minilibrarymanagementsystem.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "book")
@Getter @Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    @Column(unique = true)
    private String ISBN;

    private int publicationYear;

    @OneToMany(mappedBy = "book")
    private List<BorrowedBook> borrowedBy;
}
