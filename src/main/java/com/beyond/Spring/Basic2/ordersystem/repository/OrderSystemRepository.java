package com.beyond.Spring.Basic2.ordersystem.repository;

import com.beyond.Spring.Basic2.ordersystem.domain.OrderSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderSystemRepository extends JpaRepository <OrderSystem, Long> {
}
