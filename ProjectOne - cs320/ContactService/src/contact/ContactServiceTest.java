package contact;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactServiceTest {
	
	@Test //testing add
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact t1 = new Contact("143252", "Jane","Doe","4444444444", "Mystery Lane");
		assertEquals(true, cs.addContact(t1));
	}
	
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact t1 = new Contact("T001", "Jane", "Doe", "4444444444", "main street"); 
		Contact t2 = new Contact("T002", "John", "Doe", "5555555555", "main street");
		Contact t3 = new Contact("T003", "Joey", "Doe", "6666666666", "main street");
		
		cs.addContact(t1);
		cs.addContact(t2);
		cs.addContact(t3);
		
		assertEquals(true, cs.deleteContact("T003"));
		assertEquals(false, cs.deleteContact("T004"));
		assertEquals(false, cs.deleteContact("T003"));
	}
	
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		
		Contact t1 = new Contact("T001", "Jane", "Doe", "4444444444", "main street"); 
		Contact t2 = new Contact("T002", "John", "Doe", "5555555555", "main street");
		Contact t3 = new Contact("T003", "Joey", "Doe", "6666666666", "main street");
		
		cs.addContact(t1);
		cs.addContact(t2);
		cs.addContact(t3);
		
		assertEquals(true,cs.updateContact("T003", "Joey", "Doe", "66666666666", "main street"));
		assertEquals(false,cs.updateContact("T003", "Joey", "Doe", "66666666666", "main street"));
	}
}
	

	
