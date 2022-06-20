package com.example.Project;

import com.example.Project.Models.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {

    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    public Optional<Order> getOrderbyId(String id) {

        return orderRepository.findById(id);
    }

    public List<Order> getTop5Orders(String id) {

        return orderRepository.findTop5ByOrderByOrderDateDesc(id);
    }
    public List<Order> getAllForOneUser(String id) {

        return orderRepository.findAllByOrderByOrderDateDesc(id);
    }
    public void deleteOrderbyId(String id) {
        orderRepository.deleteById(id);
    }
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
