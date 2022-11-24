package GKA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    protected User user;

    @OneToOne
    protected Ticket ticket;

    protected boolean paid;

    protected boolean actual;
}
