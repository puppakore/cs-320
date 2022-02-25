import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TaskServiceTest {
	
	public static List<Task>tasks = new ArrayList<>();
	
	@Test
	public void validTaskData() {
		Task task = new Task("0000000001", "Reading", "Read Novel Book");
		addTask(task);
		System.out.println("New Task:" + tasks);
		System.out.println("size:"+tasks.size());
	}
	@Test
	public void invalidName() {
		Task task = new Task("0000000002", "Playing", "PS5");
		addTask(task);
		System.out.println("size:"+tasks.size());
		
	}
	
	@Test
	public void invalidDescription() {
		Task task = new Task("0000000002", "Playing", "Playstation 5 Playstation");
		addTask(task);
		System.out.println("size:" + tasks.size());
		
	}
	
	@Test
	public void existingID() {
		Task task = new Task("0000000001", "Reading", "Read Novel Bool");
		addTask(task);
		System.out.println("size" + tasks.size());
	}
	
	@Test
	public void updateTask() {
		Task task = new Task("0000000001", "Singing", "Wedding Engagement");
		update(task);
		System.out.println("Updated:" + tasks);
		System.out.println("size;" + tasks.size());
		
	}
	
	@Test
	public void deleteTask() {
		deleteTask("0000000001");
		System.out.println("size:" + tasks.size());
	}
	
	
	public boolean addTask(Task task) {
		int index = getIndex1(task);
		
		if(index < 0 &&validateID(task.getId())&&validateName(task.getName())&&validateDescription(task.getDescription())) {
			tasks.add(task);
			return true;
		}
		return false;
	}
	
	public void deleteTask(String id) {
		int index =  getIndex1(new Task(id, "",""));
		
		if(index >=0)
			tasks.remove(index);
	}
	
	public void update(Task task) {
		for(Task obj: tasks) {
			if(obj.equals(task)&&validateName(task.getName())&&validateDescription(task.getDescription())) {
				obj.setName(task.getName());
				obj.setDescription(task.getDescription());
				
			}
		}
	}
	
	public int getIndex1(Task task) {
		int index = Collections.binarySearch(tasks,  task, Task.compareById);
		return index;
	}
	
	public boolean validateID(String id) {
		if(id !=null&& id.length()<=10)
			return true;
		return false;
	}
	
	public boolean validateName(String name) {
		if(name != null&&name.length()<=20)
			return true;
		return false;
	}
	
	public boolean validateDescription(String description) {
		if(description !=null &&description.length()<=50)
			return true;
		return false;
	}
	
}
	
	
	
