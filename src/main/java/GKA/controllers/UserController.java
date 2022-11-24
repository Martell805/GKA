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
    public ResponseEntity<User> add(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.add(user));
    }

    @PutMapping()
    public ResponseEntity<User> edit(@RequestBody User user) {
        User result = this.userService.edit(user);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> find(@PathVariable Long id) {
        User result = this.userService.find(id);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> findByEmail(@PathVariable String email) {
        User result = this.userService.findByEmail(email);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<User> findByName(@PathVariable String name) {
        User result = this.userService.findByName(name);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id) {
        this.userService.delete(id);

        return ResponseEntity.ok().build();
    }
}