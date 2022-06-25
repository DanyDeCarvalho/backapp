package com.example.Project.Controllers;

import com.example.Project.ContactService;
import com.example.Project.Models.Contact;
import com.example.Project.Models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping
    public List<Contact> fetchAllProducts() {
        return contactService.getAllContacts();
    }
    @GetMapping("/{id}")
    public Optional<Contact> getProduct(@PathVariable String id) {
        return contactService.getContactbyId(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable String id) {
        contactService.deleteContactbyId(id);
    }
    @PostMapping("/save")
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }
}
