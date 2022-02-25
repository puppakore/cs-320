import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskService {

	public static List<Task>tasks = new ArrayList<>();
	
	public static void main(String[]args) {
		TaskService service = new TaskService();
		
		service.addTask(new Task("0000000001","Reading","Read Novel Book"));
		service.addTask(new Task("0000000002", "Playing","Playstation 5"));
		service.addTask(new Task("0000000003", "Walking", "Walk the dog"));
		
		for(Task obj: tasks) {
			System.out.println(obj);
		}
		service.addTask(new Task("0000000001", "Singing", "Wedding Engagement"));
		
		System.out.println("Delete Task ID #0000000002");
		service.deleteTask("0000000002");
		
		System.out.println("Update Task ID #0000000003");
		service.update(new Task("0000000003", "Running", "Jogging with friends"));
		
		for(Task obj:tasks) {
			System.out.println(obj);
		}
	}

	public boolean addTask(Task task) {
		int index = getIndex(task);
		
		if(index<0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
			tasks.add(task);
			return true;
		}
		return false;
	}
	

	public void deleteTask(String id) {
		int index = getIndex(new Task(id,"",""));
		
		if(index>=0)
			tasks.remove(index);
	}
	
	public void update(Task task) {
		for(Task obj:tasks) {
			if(obj.equals(task)&&validateName(task.getName())&&validateDescription(task.getDescription())) {
				obj.setName(task.getName());
				obj.setDescription(task.getDescription());

			}
		}
	}
	public int getIndex(Task task) {
		int index = Collections.binarySearch(tasks,  task, Task.compareById);
		return index;
	}
	
	public boolean validateID(String id) {
		if(id != null && id.length()<=10)
			return true;
		
		return false;
	}
	private boolean validateName(String name) {
		if(name != null && name.length()<=20)
			return true;
		
		return false;
	}
	
	private boolean validateDescription(String description) {
		if(description != null && description.length() <= 50)
			return true;
		
		return false;
	}
}

	
	

	

	