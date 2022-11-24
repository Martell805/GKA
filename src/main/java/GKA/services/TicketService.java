package GKA.services;

import GKA.models.Ticket;
import GKA.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
