package com.geekster.EcommerceApplication.Service;

import com.geekster.EcommerceApplication.Model.Order;
import com.geekster.EcommerceApplication.Repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepository orderRepository;

    public void addAllOrder(Iterable<Order> orderSm) {
        orderRepository.saveAll(orderSm);
    }

    public List<Order> getOrderById(Iterable<Long> orderId) {
        return orderRepository.findAllById(orderId);
    }
}
