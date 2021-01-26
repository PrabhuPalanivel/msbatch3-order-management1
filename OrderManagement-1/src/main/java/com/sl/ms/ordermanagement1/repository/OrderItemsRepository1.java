package com.sl.ms.ordermanagement1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sl.ms.ordermanagement1.model.*;

@Repository
public interface OrderItemsRepository1 extends JpaRepository<OrderItems, Integer>{
	public List<OrderItems> findByOrderid(Integer orderid);
}
