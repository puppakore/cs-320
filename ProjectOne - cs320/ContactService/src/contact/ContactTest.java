package contact;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ContactTest {
	Contact contact = new Contact("1","firstName","lastName", "123456789", "123 main street");
	//making the object as a class member so that all the methods can access it
	
	@Test
	void getContactID() {
		assertEquals("1", contact.getContactID());
	}
	
	@Test
	void getFirstName() {
		assertEquals("firstName", contact.getFirstName());
	}
	
	@Test
	void getLastName() {
		assertEquals("lastName",contact.getLastName());
	}
	
	@Test
	void getPhoneNumber() {
		assertEquals("123456789",contact.getPhoneNumber());
	}
	
	@Test
	void getAddress() {
		assertEquals("123 main street",contact.getAddress());
	}
	
	@Test
	void testToString() {
		assertEquals("Contact[contactID=1, firstName=firstName, lastName=lastName,phoneNumber=123456789, address=123 main street]", contact.toString());
	}
}
	
