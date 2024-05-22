package com.andresoft.optimumbooking.domain.repositories;

import com.andresoft.optimumbooking.domain.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
