package com.example.Project;

import com.example.Project.Models.Contact;
import com.example.Project.Models.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
    public Optional<Contact> getContactbyId(String id) {

        return contactRepository.findById(id);
    }
    public void deleteContactbyId(String id) {
        contactRepository.deleteById(id);
    }
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
