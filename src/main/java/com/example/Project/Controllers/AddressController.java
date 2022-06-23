package com.example.Project.Controllers;

import com.example.Project.AddressService;
import com.example.Project.Models.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController (AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> fetchAllOrders() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Optional<Address> getUser(@PathVariable String id) {
        return addressService.getAddressbyId(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id) {
        addressService.deleteAddressbyId(id);
    }
    @PostMapping("/save")
    public Address addUser(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }
}
