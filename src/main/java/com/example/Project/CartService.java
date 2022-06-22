package com.example.Project;

import com.example.Project.Models.Cart;
import com.example.Project.Models.Product;
import com.example.Project.Session.CartQuantity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private Object Product;

    public CartService(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
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
