package contact; //what needs to be included
public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	
	public Contact(String contactID,String firstName,String lastName,String phoneNumber,String address){
		super(); //what needs to go where?
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getContactID() { //retrieve thing labeled ContactID
		return contactID;
	}
	
	public void setContactID(String contactID) { //put thing labeled ContactID into ContactID slot
		this.contactID = contactID;
	}
	
	public String getFirstName() { //retrieve thing labeled FirstName 
		return firstName;
	}
	
	public void setFirstName(String firstName) { //put thing labeled FirstName into FirstName spot
		this.firstName = firstName;
	}
	
	public String getLastName(){ //retrieve thing labeled LastName
		return lastName;
	}
	
	public void setLastName(String lastName) {// put thing labeled LastName into LastName spot
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() { //get thing labeled PhoneNumber
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) { //put thing labeled phoneNumber into phoneNumber spot
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() { //get thing labeled Address
		return address;
	}
	
	public void setAddress(String address) { //put thing labeled address into address spot
		this.address = address;
	}
	@Override
	public String toString() { //check if the two contacts are same or not
		return "Contact[contactID="+contactID+",firstName="+firstName+",lastName="+lastName+",phoneNumber="+phoneNumber+",address="+address+"]";
		
	}		
	}
	


