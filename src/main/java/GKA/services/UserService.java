package GKA.services;

import GKA.models.User;
import GKA.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User add(User user){
        return this.userRepository.save(user);
    }

    public void delete(Long id){
        this.userRepository.deleteById(id);
    }

    public User edit(User user){
        return this.userRepository.save(user);
    }

    public User find(Long id){
        return this.userRepository.findById(id).orElse(null);
    }
}
