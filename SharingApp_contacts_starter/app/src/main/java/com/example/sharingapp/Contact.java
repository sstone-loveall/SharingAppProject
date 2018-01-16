package com.example.sharingapp;

import java.util.UUID;

/**
 * Contact class
 */

public class Contact extends Observable {

    private String username;
    private String email;
    private String id;

    public Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;

        if (id == null) {
            setId();
        }
        else {
            updateId(id);
        }
    }

    /**
     * Set the default ID for the contact
     */
    public void setId() {
        this.id = UUID.randomUUID().toString();
        notifyObservers();
    }

    /**
     * Retrieve the ID for the contact
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Update the ID for the contact to the given value
     * @param id
     */
    public void updateId(String id) {
        this.id = id;
        notifyObservers();
    }

    /**
     * Set the username for the contact
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
        notifyObservers();
    }

    /**
     * Retrieve the username for the contact
     * @return the username of the contact
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the email for the contact
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
        notifyObservers();
    }

    /**
     * Retrieve the email for the contact
     * @return the email for the contact
     */
    public String getEmail() {
        return email;
    }
}
