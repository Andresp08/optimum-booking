package com.andresoft.optimumbooking.domain.repositories;

import com.andresoft.optimumbooking.domain.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Set<Hotel> findByPriceLessThan(BigDecimal price);

    Set<Hotel> findByPriceIsBetween(BigDecimal min, BigDecimal max);

    Set<Hotel> findByRatingGreaterThan(int rating);

    Optional<Hotel> findByReservationsId(UUID id);
}
