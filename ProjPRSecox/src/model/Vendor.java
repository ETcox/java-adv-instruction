package model;

public class Vendor {
	private int id ;
	private String code ;
	private String name;
	private String address;
	private String city ;
	private String state;
	private String zip; 
	private String phone; 
	private String email;
	
	
	public Vendor() {
		
	}


	public Vendor(int id, String code, String name, String address, String city, String state, String zip, String phone,
			String email) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		zip = zip;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		email = email;
	} 


    

    

    
   
   
   
   
   
    
    
    
   
   
}
