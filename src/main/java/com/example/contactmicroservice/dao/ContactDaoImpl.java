package com.example.contactmicroservice.dao;

import com.example.contactmicroservice.dao.dom.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    private final List<Contact> contacts;

    @Autowired
    public ContactDaoImpl() {
        this.contacts = new ArrayList<>();
        Contact contact = new Contact();
        contact.setContactId(1);
        contact.setEmailId("ajay@gmail.com");
        contact.setMobileNumber("9876543210");
        contact.setUserId(1);
        this.contacts.add(contact);
    }

    @Override
    public Contact saveContact(Contact contact) {
        this.contacts.add(contact);
        return contact;
    }

    @Override
    public Contact updateContact(Contact contact) {
        Contact saveContact = this.contacts.stream().filter(u -> u.getContactId() == contact.getContactId()).findFirst().orElse(null);
        if (saveContact != null) {
            saveContact.setEmailId("vishu@gmail.com");
            saveContact.setMobileNumber("1234567890");
            return saveContact;
        }
        return null;
    }

    @Override
    public void deleteContact(long contactId) {
        this.contacts.stream().filter(u -> u.getContactId() == contactId).findFirst().ifPresent(this.contacts::remove);
    }

    @Override
    public List<Contact> getContacts() {
        return this.contacts;
    }

    @Override
    public Contact getContactBy(long contactId) {
        return this.contacts.stream().filter(u -> u.getContactId() == contactId).findFirst().orElse(null);
    }
}
