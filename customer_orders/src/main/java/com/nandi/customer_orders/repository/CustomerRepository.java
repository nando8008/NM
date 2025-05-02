package com.nandi.customer_orders.repository;

import com.nandi.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Priyanka
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
