package com.maxtihon.tacocloud.repository;

import com.maxtihon.tacocloud.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
