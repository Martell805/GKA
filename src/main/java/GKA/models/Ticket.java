package GKA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue
    protected Long id;

    protected String company;
    protected String formCountry;
    protected String formAirport;
    protected Calendar fromTime;
    protected String toCountry;
    protected String toAirport;
    protected Calendar toTime;
    protected int cost;
}
