package GKA.services;

import GKA.models.User;
import GKA.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User add(User student){
        return this.userRepository.save(student);
    }

    public void delete(Long id){
        this.userRepository.deleteById(id);
    }

    public User edit(User student){
        return this.userRepository.save(student);
    }

    public User find(Long id){
        return this.userRepository.findById(id).orElse(null);
    }
}
