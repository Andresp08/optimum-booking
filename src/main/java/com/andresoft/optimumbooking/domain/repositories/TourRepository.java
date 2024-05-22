package com.andresoft.optimumbooking.domain.repositories;

import com.andresoft.optimumbooking.domain.entities.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Long> {
}
