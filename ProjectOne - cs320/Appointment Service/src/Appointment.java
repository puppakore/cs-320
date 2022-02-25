import java.util.Date;


public class Appointment { ///make class appointment
	
	final private byte APPOINTMENT_ID_LENGTH;
	final private byte APPOINTMENT_DESCRIPTION_LENGTH;
	final private String INITIALIZER;
	private String appointmentId;
	private Date appointmentDate;
	private String description;
	
	{
		APPOINTMENT_ID_LENGTH = 10;
		APPOINTMENT_DESCRIPTION_LENGTH = 50;
		INITIALIZER = "INITIAL";
	}
	
	Appointment(){
		Date today = new Date();
		appointmentId = INITIALIZER;
		appointmentDate = today;
		description = INITIALIZER;
	}
	
	Appointment(String id){
		Date today = new Date();
		updateAppointmentId(id);
		appointmentDate = today;
		description = INITIALIZER;
	}
	
	Appointment (String id, Date date, String description){
		updateAppointmentId(id);
		updateDate(date);
		updateDescription(description);
}

public void updateAppointmentId(String id) {
	if (id == null) {
		throw new IllegalArgumentException("Appt ID cannot equal null.");
	} else if (id.length()>APPOINTMENT_ID_LENGTH) {
	throw new IllegalArgumentException("Appt ID cannot exceed"+ APPOINTMENT_ID_LENGTH + "characters.");
	
	}else {
		this.appointmentId = id;
	}
}

public String getAppointmentId() {return appointmentId;}

public void updateDate(Date date) {
	if(date == null) {
		throw new IllegalArgumentException("Appointment date cannot be null.");
	}else if(date.before(new Date())) {
		throw new IllegalArgumentException("Cannot make appointment date in past.");
	}else {
		this.appointmentDate = date;
	}
}

public Date getAppointmentDate() {return appointmentDate;}

public void updateDescription(String description) {
	if(description == null) {
		throw new IllegalArgumentException("Appt description cannot be blank.");
	} else if (description.length() > APPOINTMENT_DESCRIPTION_LENGTH) {
		throw new IllegalArgumentException("Appt description cannot be blank.");
	}else {
		this.description = description;
	}
}

public String getDescription() {return description;}
}
		
	