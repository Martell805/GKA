package GKA.services;

import GKA.models.Ticket;
import GKA.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public Ticket add(Ticket ticket){
        return this.ticketRepository.save(ticket);
    }

    public void delete(Long id){
        this.ticketRepository.deleteById(id);
    }

    public Ticket edit(Ticket ticket){
        return this.ticketRepository.save(ticket);
    }

    public Ticket find(Long id){
        return this.ticketRepository.findById(id).orElse(null);
    }

    public List<Ticket> findSuitable(LocalDate fromTime, String fromAirport, String toAirport){
        return this.ticketRepository.getAllByFromTimeAndFormAirportAndToAirport(fromTime, fromAirport, toAirport);
    }
}
