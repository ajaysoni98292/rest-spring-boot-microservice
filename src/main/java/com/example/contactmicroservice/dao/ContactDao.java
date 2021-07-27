package com.example.contactmicroservice.dao;

import com.example.contactmicroservice.dao.dom.Contact;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
public interface ContactDao {

    Contact saveContact(Contact contact);

    Contact updateContact(Contact contact);

    void deleteContact(long contactId);

    List<Contact> getContacts();

    Contact getContactBy(long contactId);
}
