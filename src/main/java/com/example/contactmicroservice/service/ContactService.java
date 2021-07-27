package com.example.contactmicroservice.service;

import com.example.contactmicroservice.dao.dom.Contact;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
public interface ContactService {

    List<Contact> getContacts();

    Contact getContactBy(long contactId);

    Contact saveContact(Contact user);

    Contact updateContact(Contact user);

    void deleteContact(long userId);

}
