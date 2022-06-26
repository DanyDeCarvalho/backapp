package com.example.Project.Controllers;

import com.example.Project.CartService;
import com.example.Project.Models.Cart;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/{userSession}")
    public Optional<Cart> getCart(@PathVariable String userSession) {
        return cartService.getCart(userSession);
    } // recuperer un panier via le token

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
