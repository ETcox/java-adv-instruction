package model;

public class Product {
	public int id ;
	public int vendorId ;
	public String partNumber ;
	public String name ;
	public double price ;
	public String unit;
	public String photoPath;
	
	
	public Product() {
		
	}


	public Product(int id, int vendorId, String partNumber, String name, double price, String unit, String photoPath) {
		super();
		id = id;
		vendorId = vendorId;
		partNumber = partNumber;
		name = name;
		price = price;
		unit = unit;
		photoPath = photoPath;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		id = id;
	}


	public int getVendorId() {
		return vendorId;
	}


	public void setVendorId(int vendorId) {
		vendorId = vendorId;
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		partNumber = partNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		price = price;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		unit = unit;
	}


	public String getPhotoPath() {
		return photoPath;
	}


	public void setPhotoPath(String photoPath) {
		photoPath = photoPath;
	} 
    
   
   

   
    
    

    
    

    

    
  
}
