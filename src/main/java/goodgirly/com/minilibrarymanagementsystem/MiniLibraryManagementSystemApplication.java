package goodgirly.com.minilibrarymanagementsystem;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.entities.User;
import goodgirly.com.minilibrarymanagementsystem.repositories.BookRepository;
import goodgirly.com.minilibrarymanagementsystem.repositories.UserRepository;
import goodgirly.com.minilibrarymanagementsystem.services.BorrowedBookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MiniLibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniLibraryManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner clr (BookRepository bookRepository){
		return args -> {
			Book b = new Book();
			b.setAuthor("Yukay");
			b.setISBN("798321hfds");
			b.setTitle("Negiria");
			b.setPublicationYear(2015);
			Book b1 = new Book();
			bookRepository.save(b);
			b1.setAuthor("anas");
			b1.setISBN("79379hfdiu");
			b1.setTitle("Morocco");
			b1.setPublicationYear(2012);
			bookRepository.save(b1);
		};
	}
	@Bean
	CommandLineRunner clsUsers (UserRepository userRepository){
		return args -> {
			User user = new User();
			user.setFullName("Anas Somith");
			user.setAge(13);
			user.setEmail("anas@gmail.com");
			user.setAddress("Morocoo");
			userRepository.save(user);
			User user1 = new User();
			user1.setFullName("Mary Yukay");
			user1.setAge(16);
			user1.setEmail("mary@gmail.com");
			user1.setAddress("Nigiria");
			userRepository.save(user1);
		};
	}
	@Bean
	CommandLineRunner clrBorrowedBook(BorrowedBookService borrowedBookService){
		return args -> {
			borrowedBookService.borrowedBooksByUser(1L, List.of(1L,2L));
		};
	}
}
