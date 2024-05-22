package com.andresoft.optimumbooking.domain.repositories;

import com.andresoft.optimumbooking.domain.entities.Fly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface FlyRepository extends JpaRepository<Fly, Long> {

    @Query("SELECT f FROM Fly f WHERE f.price < :price")
    Set<Fly> selectLessPrice(BigDecimal price);

    @Query("SELECT f FROM Fly f WHERE f.price BETWEEN :min AND :max")
    Set<Fly> selectBetweenPrice(BigDecimal min, BigDecimal max);

    @Query("SELECT f FROM Fly f WHERE f.originName = :origin AND f.destinyName = :destiny")
    Set<Fly> selectOriginDestiny(String origin, String destiny);

    @Query("SELECT f FROM Fly f JOIN FETCH f.tickets t WHERE t.id = :id")
    Optional<Fly> findByTicketId(UUID id);
}
