package second_assignment;

public class Address {
	
	 private final String street;
	 private final String city;
	 private final String state;
	 private final String zip;
	
	public Address(String state,String city,String street, String zip) {

		this.state=state;
		this.city=city;
		this.street=street;
		this.zip=zip;
	}
	
	public String getState() {
		 return state;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getZip() {
		return zip;
	}
	
	@Override
	public String toString() {
		return street + ", " + city + ", "+ state + " " + zip;
	}

}
