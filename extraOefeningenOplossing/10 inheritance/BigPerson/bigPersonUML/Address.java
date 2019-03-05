package bigPersonUML;

public class Address {
	
	private String street;
	private int Number;
	private String City;
	
	public Address() {
		this("",0,"");
	}
	
	
	public Address(String street, int number, String city) {
		super();
		this.street = street;
		Number = number;
		City = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", Number=" + Number + ", City=" + City + "]";
	}
	
	

	
}
