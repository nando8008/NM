package com.nandi.customer_orders.repository;

import com.nandi.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
