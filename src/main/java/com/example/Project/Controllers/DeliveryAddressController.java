package com.example.Project.Controllers;
import com.example.Project.DeliveryAddrressService;
import com.example.Project.Models.DeliveryAddress;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
@RestController
@RequestMapping("/delivery")
public class DeliveryAddressController {

    private final DeliveryAddrressService deliveryAddrressService;

    public DeliveryAddressController(DeliveryAddrressService deliveryAddrressService) {
        this.deliveryAddrressService = deliveryAddrressService;
    }

    @GetMapping("/{userId}")
    public List<DeliveryAddress> getDeliveryAddresses(@PathVariable String userId) {
        return deliveryAddrressService.getDeliveryAddressesByUserId(userId);
    } // recuperer laddersse de livraison dun user

    @PostMapping("/save")
    public DeliveryAddress saveDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {
        return deliveryAddrressService.saveDeliveryAddress(deliveryAddress);
    }// enregister une address


}
