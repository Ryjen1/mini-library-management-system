package goodgirly.com.minilibrarymanagementsystem.repositories;

import goodgirly.com.minilibrarymanagementsystem.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
