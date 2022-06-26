package com.example.Project;

import com.example.Project.Models.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }
    public Optional<Address> getAddressbyId(String id) {
        return addressRepository.findById(id);
    }

    public void deleteAddressbyId(String id) {
        addressRepository.deleteById(id);
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }
}
