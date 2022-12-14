package GKA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
    protected String formAirport;
    protected String fromTime;
    protected String fromDate;
    protected String toAirport;
    protected String toTime;
    protected String toDate;
    protected int cost;
}
