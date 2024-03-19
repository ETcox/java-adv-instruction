package model;

public class Software extends Product implements Printable {

	private String version;

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "software [version=" + version + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void print() {
		System.out.println(getDescription() + " Verson: "+ version + " Price: "+getPrice());
		
	}
	
	
}
