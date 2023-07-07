package org.example.JUnit_Testing.Manager;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PContactManager {
    Map<String, PContact> contactList = new ConcurrentHashMap<String, PContact>();

    public void addContact(String firstName, String lastName, String phoneNumber) {
        PContact pContact = new PContact(firstName, lastName, phoneNumber);
        validateContact(pContact);
        checkIfContactAlreadyExist(pContact);
        contactList.put(generateKey(pContact), pContact);
    }

    public Collection<PContact> getAllContacts() {
        return contactList.values();
    }

    private void checkIfContactAlreadyExist(PContact pContact) {
        if (contactList.containsKey(generateKey(pContact)))
            throw new RuntimeException("Contact Already Exists");
    }

    private void validateContact(PContact contact) {
        contact.validateFirstName();
        contact.validateLastName();
        contact.validatePhoneNumber();
    }

    private String generateKey(PContact contact) {
        return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
    }
}
