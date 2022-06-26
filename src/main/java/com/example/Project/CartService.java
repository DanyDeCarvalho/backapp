package com.example.Project;

import com.example.Project.Models.Cart;
import com.example.Project.Models.Order;
import com.example.Project.Models.Product;
import com.example.Project.Session.CartQuantity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public CartService(CartRepository cartRepository, ProductRepository productRepository, OrderRepository orderRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public Cart saveCart(Cart cart) {
        Cart cart2 = cartRepository.findByUserSession(cart.getUserSession()).get();
        cartRepository.delete(cart2);
        return cartRepository.save(cart);
    }

    public Optional<Cart> getCart(String userSession) {
        return cartRepository.findByUserSession(userSession);
    }

    public Cart addCart(Cart cart) {
        Cart cartUser = cartRepository.findByUserSession(cart.getUserSession()).get();

        Integer increase = CartQuantity.IncreaseQuantity(cartUser.getQuantity());
        Product productCart = productRepository.findById("62b0374d39c9c428cd383af1").get();
        Integer increaseProduct = CartQuantity.IncreaseQuantity(productCart.getQuantityOnCart());
        productCart.setQuantityOnCart(increaseProduct);
        cartUser.setQuantity(increase);
        cartUser.getProduct().add(productCart);
        productRepository.save(productCart);
        return cartRepository.save(cartUser);
    }
}
