package com.andresoft.optimumbooking.domain.repositories;

import com.andresoft.optimumbooking.domain.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<Ticket, UUID> {
}
