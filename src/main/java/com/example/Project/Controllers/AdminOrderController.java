package com.example.Project.Controllers;

import com.example.Project.Models.Order;
import com.example.Project.Models.User;
import com.example.Project.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin/orders")
public class AdminOrderController {

    private final OrderService orderService;

    public AdminOrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable String id) {
        orderService.deleteOrderbyId(id);
    }
    @PostMapping("/save")
    public Order addOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }
}
