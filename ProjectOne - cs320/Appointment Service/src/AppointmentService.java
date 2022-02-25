import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AppointmentService { //c;ass name 
	final private List<Appointment> appointmentList = new ArrayList<>(); //make sure the list is in an array
	
	private String newUniqueId() { //make the appointment have a unique id
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(),10));
	
	}
	
	public void newAppointment() { //making new appointment catagory to the catagory list
		Appointment appt = new Appointment(newUniqueId());
		appointmentList.add(appt);
	}
	
	public void newAppointment(Date date) { //add date to the appointmentlist sppointment
		Appointment appt = new Appointment(newUniqueId());
		appointmentList.add(appt);
	}

	public void newAppointment(Date date, String description) { //add date and description to the appointmentlist appointment
		Appointment appt = new Appointment(newUniqueId(), date, description);
		appointmentList.add(appt);
	}
	
	public void deleteAppointment(String id) throws Exception { //delete the appointment from the appointment list 
		appointmentList.remove(searchForAppointment(id));
	}
	
	protected List<Appointment> getAppointmentList(){return appointmentList;}
	
	private Appointment searchForAppointment(String id) throws Exception {
		int index = 0;
		while(index <appointmentList.size()) {
			if(id.equals(appointmentList.get(index).getAppointmentId())) {
				return appointmentList.get(index);
			}
			index++;
		}
		throw new Exception("appointment doesn't exist");
	}
}


