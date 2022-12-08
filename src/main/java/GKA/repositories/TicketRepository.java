package GKA.repositories;

import GKA.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Calendar;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> getAllByFromTimeAndFormAirportAndToAirport(Calendar fromTime, String fromAirport, String toAirport);
}
