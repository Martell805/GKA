package GKA.controllers;

import GKA.models.Booking;
import GKA.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @PostMapping()
    public ResponseEntity<Booking> add(@RequestBody Booking booking) {
        return ResponseEntity.ok(this.bookingService.add(booking));
    }

    @PutMapping()
    public ResponseEntity<Booking> edit(@RequestBody Booking booking) {
        Booking result = this.bookingService.edit(booking);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> find(@PathVariable Long id) {
        Booking result = this.bookingService.find(id);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/user_id/{id}")
    public ResponseEntity< List<Booking>> findByUserId(@PathVariable Long id) {
        List<Booking> result = this.bookingService.findByUserId(id);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Booking> delete(@PathVariable Long id) {
        this.bookingService.delete(id);

        return ResponseEntity.ok().build();
    }
}