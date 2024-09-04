package com.neueda_project.stock_pantry.service;

import com.neueda_project.stock_pantry.entity.Orders;
import com.neueda_project.stock_pantry.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public void saveOrUpdate(Orders orders)
    {
        orderRepository.save(orders);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        orderRepository.deleteById(id);
    }

}
