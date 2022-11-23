package GKA.controllers;

import GKA.models.User;
import GKA.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<User> addStudent(@RequestBody User student) {
        return ResponseEntity.ok(this.userService.add(student));
    }

    @PutMapping()
    public ResponseEntity<User> editStudent(@RequestBody User student) {
        User result = this.userService.edit(student);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findStudent(@PathVariable Long id) {
        User result = this.userService.find(id);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteStudent(@PathVariable Long id) {
        this.userService.delete(id);

        return ResponseEntity.ok().build();
    }
}