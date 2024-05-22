package com.andresoft.optimumbooking.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Reservation {

    @Id
    private UUID id;

    private LocalDateTime dateTimeReservation;

    private LocalDate dateStart;

    private LocalDate dateEnd;

    private Integer totalDays;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = true)
    private Tour tour;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
