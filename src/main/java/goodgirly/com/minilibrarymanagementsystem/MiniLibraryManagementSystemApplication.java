package goodgirly.com.minilibrarymanagementsystem;

import goodgirly.com.minilibrarymanagementsystem.entities.Book;
import goodgirly.com.minilibrarymanagementsystem.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
}
