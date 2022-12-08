package GKA.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    protected Long id;
    protected String name;
    protected String surname;
    protected String patronymic;
    protected Boolean sex;
    protected String birthday;

    @Column(unique = true)
    protected String email;
    protected String password;
    protected int score;
}
