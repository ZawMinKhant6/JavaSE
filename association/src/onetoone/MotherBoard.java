package onetoone;

public class MotherBoard {
	
	private String serial;
	private String brand;
	
	public MotherBoard() {
		
	}
	public MotherBoard(String serial, String brand) {
		super();
		this.serial = serial;
		this.brand = brand;
	}
	
	public void BootUp() {
		System.out.println("Serial = " + serial + " / brand = " + brand + " is  booting up ..");
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "MotherBoard [serial=" + serial + ", brand=" + brand + "]";
	}
	
	
}
