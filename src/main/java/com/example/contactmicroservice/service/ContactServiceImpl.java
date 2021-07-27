package com.example.contactmicroservice.service;

import com.example.contactmicroservice.dao.ContactDao;
import com.example.contactmicroservice.dao.dom.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
@Service
public class ContactServiceImpl implements ContactService {

    private final ContactDao contactDao;

    @Autowired
    public ContactServiceImpl(ContactDao contactDao) {
        this.contactDao = contactDao;
    }


    @Override
    public Contact saveContact(Contact contact) {
        return this.contactDao.saveContact(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return this.contactDao.updateContact(contact);
    }

    @Override
    public void deleteContact(long contactId) {
        this.contactDao.deleteContact(contactId);
    }

    @Override
    public List<Contact> getContacts() {
        return this.contactDao.getContacts();
    }

    @Override
    public Contact getContactBy(long contactId) {
        return this.contactDao.getContactBy(contactId);
    }
}
