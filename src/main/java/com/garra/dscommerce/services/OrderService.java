package com.garra.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garra.dscommerce.dto.OrderDTO;
import com.garra.dscommerce.entities.Order;
import com.garra.dscommerce.repositories.OrderRepository;
import com.garra.dscommerce.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;

	@Transactional(readOnly = true)
	public OrderDTO findById(Long id) {
		Order order = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
		return new OrderDTO(order);
	}
}
