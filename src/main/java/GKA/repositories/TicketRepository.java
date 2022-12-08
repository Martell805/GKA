package GKA.repositories;

import GKA.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> getAllByFromTimeAndFormAirportAndToAirport(LocalDate fromTime, String fromAirport, String toAirport);
}
