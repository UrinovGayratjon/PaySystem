package uz.urinov.jwtcardtransfer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "outcome")
public class Outcome {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne(optional = false)
    private Card from;

    @ManyToOne(optional = false)
    private Card to;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private Double commissionAmount;

    public Outcome(Card from, Card to, Double amount, Date date, Double commissionAmount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.date = date;
        this.commissionAmount = commissionAmount;
    }
}
