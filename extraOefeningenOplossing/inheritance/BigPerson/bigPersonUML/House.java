package bigPersonUML;

public class House {
	
	private Address address;
	private LivingRoom livingRoom = new LivingRoom();
	private HobbyRoom hobbyRoom = new HobbyRoom();
	
	
	public House() {
		this(new Address(), new LivingRoom(), new HobbyRoom());
	}
	
	public House(Address address, LivingRoom livingRoom, HobbyRoom hobbyRoom) {
		super();
		this.address = address;
		this.livingRoom = livingRoom;
		this.hobbyRoom = hobbyRoom;
	}

	public House(Address gamerAddress) {
		this(gamerAddress, new LivingRoom(), new HobbyRoom());// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
