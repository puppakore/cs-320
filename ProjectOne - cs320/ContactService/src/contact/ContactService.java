package contact;
import java.util.ArrayList;

import contact.Contact;

public class ContactService { 
	private ArrayList<Contact>contacts; //list of contacts
	public ContactService() {	//default constructor
		contacts = new ArrayList<>();
}
public boolean addContact(Contact contact) { //determine if contact is there and add if not present.
	boolean isPresent = false; //the part that determines if contact is there
	for(Contact contactList:contacts) {
		if (contactList.equals(contact)) {
			isPresent = true;
		}
	}

	if(!isPresent) { //if contact is not there add contact
		contacts.add(contact);
		System.out.println("Contact added successfully!");
		return true;
	}else {
		System.out.println("contact already here");
		return false;
	}
}

public boolean deleteContact(String contactID) { //delete the contact with the given contact Id if they are already there
	for (Contact c:contacts) {
		if (c.getContactID().equals(contactID)) {
			contacts.remove(c);
			System.out.println("Contact remove successfully!");
			return true;
		}	
	}
	System.out.println("contact not present");	
	return false;
}

//this method updates contact with the given contactID and if found update its
//first name, last name, phone number, address, pass an empty string if certain
//details are not to be changed
public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) { //update the contect with the contactID. if the contact is updated in the list then contact will contain firstName, lastName, phoneNUmber and address.
	for (Contact c:contacts) {
		if(c.getContactID().equals(contactID)) {
			if(!firstName.equals(""))
				c.setFirstName(firstName);
			if(!lastName.equals(""))
				c.setLastName(lastName);
			if(!address.equals(""))
				c.setAddress(address);
			System.out.println("Contact updated Successfully!");
				return true;
		}
	}
	System.out.println("contact not present");
	return false;
	}

	
}



