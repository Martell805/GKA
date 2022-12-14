package GKA.repositories;

import GKA.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> getAllByFromTimeAndFromDateAndFormAirportAndToAirport(String fromTime, String fromDate, String fromAirport, String toAirport);
}
