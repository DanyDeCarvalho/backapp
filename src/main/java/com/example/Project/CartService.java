package com.example.Project;

import com.example.Project.Models.Cart;
import com.example.Project.Models.Product;
import com.example.Project.Session.CartQuantity;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }



    public Cart addCart(Cart cart) {
        Cart cartUser = cartRepository.findByUserSession(cart.getUserSession()).get();
        Integer increase = CartQuantity.IncreaseQuantity(cartUser.getQuantity());
        cartUser.setQuantity(increase);
        
        return cartRepository.save(cartUser);
    }
}
