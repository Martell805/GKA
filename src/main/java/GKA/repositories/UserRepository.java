package GKA.repositories;

import GKA.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    @Query("select u from User u where concat(u.name, ' ', u.surname, ' ', u.patronymic) = :fullname")
    Optional<User> findByFullname(String fullname);
}
