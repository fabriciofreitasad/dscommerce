package com.garra.dscommerce.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.garra.dscommerce.entities.Order;
import com.garra.dscommerce.entities.User;
import com.garra.dscommerce.projections.UserDetailsProjection;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
		
		

}
