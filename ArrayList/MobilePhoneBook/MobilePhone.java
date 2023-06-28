package org.example.ArrayList.MobilePhoneBook;

import java.util.ArrayList;

public class MobilePhone {
    private final ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) != -1){
            return false;
        }else{
            return myContacts.add(contact);
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact) != -1){
            return myContacts.remove(oldContact) && myContacts.add(newContact);
        }else{
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        return findContact(contact) != -1 && myContacts.remove(contact);
    }

    private int findContact(Contact queryContact){
        return findContact(queryContact.getName());
    }

    private int findContact(String contactName){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }return -1;
    }

    public Contact queryContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }return null;
    }
    public void printContacts(){
        System.out.println("contact List: ");
        for (int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " ->" + contact.getPhoneNumber());
        }
    }
}
