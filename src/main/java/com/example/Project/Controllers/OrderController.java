package com.example.Project.Controllers;

import com.example.Project.Models.Order;
import com.example.Project.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
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
    } //  recuperer une order en focntion de son id

    @GetMapping("/{id}/last5Orders")
    public List<Order> getTop5Orders(@PathVariable String id) {
        return orderService.getTop5Orders(id);
    } // recuperer les 5 derniers orders de l'utilisateur

    @GetMapping("/{id}/allOrders")
    public List<Order> getAllOrders(@PathVariable String id) {
        return orderService.getAllForOneUser(id);
    } // recuperer totues les orders de l'utilisateur

    @GetMapping("/createOrder/{cartId}")
    public Order createOrder(@PathVariable String cartId) {
        return orderService.createOrder(cartId);
    } // creer une order une fois le panier valider
    @PostMapping("/save")
    public Order addOrder(@RequestBody Order order) {
        Order order1 = orderService.saveOrder(order);
        return order1;
    } // enregister une order
}
