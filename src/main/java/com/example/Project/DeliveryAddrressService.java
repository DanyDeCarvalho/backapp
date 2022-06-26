package com.example.Project;

import com.example.Project.Models.DeliveryAddress;
import com.example.Project.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAddrressService {
    private final DeliveryAddressRepository deliveryAddressRepository;

    public DeliveryAddrressService(DeliveryAddressRepository deliveryAddressRepository) {
        this.deliveryAddressRepository = deliveryAddressRepository;
    }

    public List<DeliveryAddress> getDeliveryAddressesByUserId(String userId) {
        return deliveryAddressRepository.findAllByUserId(userId);
    };

    public DeliveryAddress saveDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressRepository.save(deliveryAddress);
    };


}
