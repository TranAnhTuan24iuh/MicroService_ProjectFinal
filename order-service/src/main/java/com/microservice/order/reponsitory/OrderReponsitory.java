package com.microservice.order.reponsitory;

import com.microservice.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReponsitory extends JpaRepository<Order, Long> {
}
