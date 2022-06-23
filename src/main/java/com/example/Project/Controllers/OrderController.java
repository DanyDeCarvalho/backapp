package com.example.Project.Controllers;

import com.example.Project.Models.Order;
import com.example.Project.Models.User;
import com.example.Project.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> fetchAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable String id) {
        return orderService.getOrderbyId(id);
    }

    @GetMapping("/{id}/last5Orders")
    public List<Order> getTop5Orders(@PathVariable String id) {
        return orderService.getTop5Orders(id);
    }

    @GetMapping("/{id}/allOrders")
    public List<Order> getAllOrders(@PathVariable String id) {
        return orderService.getAllForOneUser(id);
    }

    @PostMapping("/save")
    public Order addOrder(@RequestBody Order order) {
        Order order1 = orderService.saveOrder(order);
        return order1;
    }
}
