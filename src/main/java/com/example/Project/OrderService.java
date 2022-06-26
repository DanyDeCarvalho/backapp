package com.example.Project;

import com.example.Project.Models.Cart;
import com.example.Project.Models.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final CartRepository cartRepository;

    public OrderService(OrderRepository orderRepository, CartRepository cartRepository) {
        this.orderRepository = orderRepository;
        this.cartRepository = cartRepository;
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
    public Order createOrder(String cartId) {
        Cart cart = cartRepository.findByUserSession(cartId).get();
        Order order = new Order();
        order.setUserId(cartId);
        order.setTotal(cart.getTotal());
        order.setOrderNumber(12184);
        order.setCart(cart.getListProduct());
        order.setStatus("En preparation");
        cartRepository.delete(cart);
        return orderRepository.save(order);
    }
    public void deleteOrderbyId(String id) {
        orderRepository.deleteById(id);
    }
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

}
