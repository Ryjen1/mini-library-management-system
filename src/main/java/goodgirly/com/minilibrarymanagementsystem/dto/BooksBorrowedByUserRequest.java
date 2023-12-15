package goodgirly.com.minilibrarymanagementsystem.dto;


import java.util.List;

public record BooksBorrowedByUserRequest(Long userId, List<Long> booksId) {
}
