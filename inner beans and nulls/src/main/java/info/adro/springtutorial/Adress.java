package info.adro.springtutorial;

public class Adress {

	private String locality;
	private String zipCode;
	private String street;
	private String streetNumber;
	
	public Adress(String locality, String zipCode, String street, String streetNumber) {
		super();
		this.locality = locality;
		this.zipCode = zipCode;
		this.street = street;
		this.streetNumber = streetNumber;
	}
	
	
	public String toString () {
		return locality +" "+ zipCode +" "+ street +" "+ streetNumber;
	}
}
