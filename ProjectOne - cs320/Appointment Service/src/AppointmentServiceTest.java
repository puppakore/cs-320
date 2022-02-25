import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {
	private String id, description, tooLongDescription;
	private Date date, pastDate;

	@SuppressWarnings("deprecation")
	@BeforeEach
	
	void setUp() {
		id = "1234567890";
		description = "Appointment description is required.";
		date = new Date(4512, Calendar.APRIL, 1);
		tooLongDescription = "description is too long.";
		
		pastDate = new Date(0);
	}
	
	@Test
	void testNewAppointment() {
		AppointmentService service = new AppointmentService();
		
		service.newAppointment();
		assertNotNull(service.getAppointmentList().get(0).getAppointmentId());
		assertNotNull(service.getAppointmentList().get(0).getAppointmentDate());
		assertNotNull(service.getAppointmentList().get(0).getDescription());
		
		service.newAppointment(date);
		assertNotNull(service.getAppointmentList().get(1).getAppointmentId());
		
	}
	
	@Test
	void deleteAppointment() throws Exception {
		AppointmentService service = new AppointmentService();
		
		service.newAppointment();
		service.newAppointment();
		service.newAppointment();
		
		String firstId = service.getAppointmentList().get(0).getAppointmentId();
		String secondId = service.getAppointmentList().get(1).getAppointmentId();
		String thirdId = service.getAppointmentList().get(2).getAppointmentId();
		
		assertNotEquals(firstId, secondId);
		assertNotEquals(firstId,thirdId);
		assertNotEquals(secondId, thirdId);
		
		assertThrows(Exception.class, () -> service.deleteAppointment(id));
		
		service.deleteAppointment(firstId);
		assertThrows(Exception.class, () -> service.deleteAppointment(firstId));
		assertNotEquals(firstId, service.getAppointmentList().get(0).getAppointmentId());
	}

}
