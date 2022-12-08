package GKA.controllers;

import GKA.models.Ticket;
import GKA.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping()
    public ResponseEntity<Ticket> add(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(this.ticketService.add(ticket));
    }

    @PutMapping()
    public ResponseEntity<Ticket> edit(@RequestBody Ticket ticket) {
        Ticket result = this.ticketService.edit(ticket);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> find(@PathVariable Long id) {
        Ticket result = this.ticketService.find(id);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ticket> delete(@PathVariable Long id) {
        this.ticketService.delete(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{fromTime}/{fromAirport}/{toAirport}")
    public ResponseEntity<List<Ticket>> find(@PathVariable String fromTime, @PathVariable String fromAirport, @PathVariable String toAirport) {
        List<Ticket> result = this.ticketService.findSuitable(fromTime, fromAirport, toAirport);

        if (result == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }
}
