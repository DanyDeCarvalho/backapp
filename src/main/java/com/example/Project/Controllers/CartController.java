package com.example.Project.Controllers;

import com.example.Project.CartService;
import com.example.Project.Models.Cart;
import com.example.Project.Models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/save")
    public Cart addCart(@RequestBody Cart cart) {
        Cart cart1 = cartService.saveCart(cart);
        return cart1;
    }

    @PutMapping("/add")
    public Cart addCartNumber(@RequestBody Cart cart ) {
        return cartService.addCart(cart);
    }
}
