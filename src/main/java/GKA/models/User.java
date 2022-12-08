package GKA.models;

import lombok.*;

import javax.persistence.*;

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

    @Column(unique = true)
    protected String email;
    protected String password;
    protected int score;
}
