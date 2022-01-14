package entity;

/*
 * Address Entity
 */
public class Address {

	private String city;
	private String State;
	private int zip;
	private long phoneNo;

//	public Address(String city, String state, int zip, long phoneNo) {
//		super();
//		this.city = city;
//		State = state;
//		this.zip = zip;
//		this.phoneNo = phoneNo;
//	}
	
	

	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public int getZip() {
		return zip;
	}



	public void setZip(int zip) {
		this.zip = zip;
	}



	public long getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", zip=" + zip + ", phoneNo=" + phoneNo + "]";
	}

}
