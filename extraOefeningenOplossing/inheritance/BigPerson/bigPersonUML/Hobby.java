package bigPersonUML;

public class Hobby {
	
	private double timePerWeek;
	private String name;
	private Address location;
	private static int count;

	public Hobby() {
		this(0,"",new Address());
	}

	public Hobby(double timePerWeek, String name, Address location) {
		super();
		this.timePerWeek = timePerWeek;
		this.name = name;
		this.location = location;
		count++;
	}
	
	

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hobby [name=" + name + " tijd per week=" + timePerWeek + " uur per week,  + op location=" + location + "]";
	}

	
	

	
	
	
	
}
