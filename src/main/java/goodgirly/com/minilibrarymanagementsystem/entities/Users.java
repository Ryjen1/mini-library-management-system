package goodgirly.com.minilibrarymanagementsystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@Table(name = "user")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String email;
    @Column(name = "full_name")
    @Length(min = 6, max = 15, message = "alphabets must be greater than 6 and not more than 15")
    private String fullName;
    @Min(value = 18,message = "age must be 18 and above")
    @Max(value = 70, message = "age must be less than 70")
    private int age;
    private String address;
}
