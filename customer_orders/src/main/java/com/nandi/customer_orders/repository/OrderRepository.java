package com.nandi.customer_orders.repository;

import com.nandi.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Priyanka
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
