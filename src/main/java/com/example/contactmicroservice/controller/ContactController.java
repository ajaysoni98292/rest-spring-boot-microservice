package com.example.contactmicroservice.controller;

import com.example.contactmicroservice.dao.dom.Contact;
import com.example.contactmicroservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/all")
    public List<Contact> getUsers() {
        return this.contactService.getContacts();
    }

    @GetMapping("/contact/{contactId}")
    public Contact getUser(@PathVariable long contactId) {
        return this.contactService.getContactBy(contactId);
    }

    @PostMapping("/add")
    public Contact addUser(@RequestBody Contact user) {
        return this.contactService.saveContact(user);
    }

    @PutMapping("/update")
    public Contact updateUser(@RequestBody Contact user) {
        return this.contactService.updateContact(user);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable long userId) {
        this.contactService.deleteContact(userId);
    }

}
