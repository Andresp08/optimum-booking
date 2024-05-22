package com.andresoft.optimumbooking.domain.repositories;

import com.andresoft.optimumbooking.domain.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReservationRepository extends CrudRepository<Reservation, UUID> {
}
