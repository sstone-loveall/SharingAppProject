package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

/**
 * ContactListController is responsible for all communication between views and ContactList object
 */
public class ContactListController  {

    private ContactList contact_list;

    public ContactListController() {
        this.contact_list = new ContactList();
    }

    public ContactListController(ContactList contact_list) {
        this.contact_list = contact_list;
    }

    public void addObserver(Observer observer) {
        contact_list.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact_list.removeObserver(observer);
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        this.contact_list.setContacts(contact_list);
    }

    public ArrayList<Contact> getContacts() {
        return contact_list.getContacts();
    }

    public boolean addContact(Contact contact, Context context) {
        AddContactCommand cmd = new AddContactCommand(contact_list, contact, context);
        cmd.execute();
        return cmd.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context) {
        DeleteContactCommand cmd = new DeleteContactCommand(contact_list, contact, context);
        cmd.execute();
        return cmd.isExecuted();
    }

    public boolean editContact(Contact contact, Contact updated_contact, Context context) {
        EditContactCommand cmd = new EditContactCommand(contact_list, contact, updated_contact, context);
        cmd.execute();
        return cmd.isExecuted();
    }

    public Contact getContact(int index) {
        return contact_list.getContact(index);
    }

    public ArrayList<String> getAllUsernames() {
        return contact_list.getAllUsernames();
    }

    public boolean hasContact(Contact contact) {
        return contact_list.hasContact(contact);
    }

    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public boolean isUsernameAvailable(String username) {
        return contact_list.isUsernameAvailable(username);
    }

    public int getIndex(Contact contact) {
        return contact_list.getIndex(contact);
    }

    public int getSize() {
        return contact_list.getSize();
    }

    public void loadContacts(Context context) {
        contact_list.loadContacts(context);
    }
}
