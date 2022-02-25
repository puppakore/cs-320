import java.util.Comparator;

public class Task {
	private String id;
	private String name;
	private String description;
	
	public Task(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	//getting and setting public variables value
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Task t =(Task)obj;
			return getId().equals(t.getId());
		
	}
	public static Comparator<Task>compareById = new Comparator<Task>() {
		@Override
		public int compare(Task t1, Task t2) {
			return t1.getId().compareTo(t2.getId());
		}
	};
	
	@Override
	public String toString() {
		return"Task ID:" +getId()+"\nName:"+getName()+"\nDescription:"+getDescription()+"\n";
	}
}
	

	
	
