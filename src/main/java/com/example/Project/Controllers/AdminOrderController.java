package com.example.Project.Controllers;

import com.example.Project.Models.Order;
import com.example.Project.OrderService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
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
        Order order1 = orderService.saveOrder(order);
        return order1;
    }
}
