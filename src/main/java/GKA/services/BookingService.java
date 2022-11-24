package GKA.services;

import GKA.models.Booking;
import GKA.repositories.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;

    public Booking add(Booking booking){
        return this.bookingRepository.save(booking);
    }

    public void delete(Long id){
        this.bookingRepository.deleteById(id);
    }

    public Booking edit(Booking booking){
        return this.bookingRepository.save(booking);
    }

    public Booking find(Long id){
        return this.bookingRepository.findById(id).orElse(null);
    }

    public List<Booking> findByUserId(Long id){
        return this.bookingRepository.findAllByUserId(id);
    }
}
