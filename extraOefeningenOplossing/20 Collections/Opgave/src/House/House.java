package House;

public class House {
	
	private double squareM;
	private double rooms;
	private double price;
	private HouseType type;
	
	public House(double squareM, double rooms, double price, HouseType type) {
		super();
		this.squareM = squareM;
		this.rooms = rooms;
		this.price = price;
		this.type = type;
	}
	
	public double getSquareM() {
		return squareM;
	}
	public void setSquareM(double squareM) {
		this.squareM = squareM;
	}
	public double getRooms() {
		return rooms;
	}
	public void setRooms(double rooms) {
		this.rooms = rooms;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public HouseType getType() {
		return type;
	}
	public void setType(HouseType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "type=" + type + " [M²=" + squareM + ", Rooms=" + rooms + ", price=" + price + "]";
	}
	
	
	

}
