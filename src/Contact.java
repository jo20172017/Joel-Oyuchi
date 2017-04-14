
public class Contact {
	protected String firstName;
	protected String lastName;
	protected String number;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumber() {
		return number;
	}
	

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFormatedNumber() {
		String one = number.substring(0, 3);
		String two = number.substring(3,6);
		String three = number.substring(6,10);
		 
		return "("+one+")-"+two+"-"+three;
	}

	/*public Contact(String first, String last, String number) {
		this.first=first;
		this.last=last;
		this.number=number; 
	
	}
*/
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  firstName +"  "+ lastName+" " + street + " " + city + " "+ state + " " + zipCode + "  " +  this.getFormatedNumber()  ;
	}
	
	

}
