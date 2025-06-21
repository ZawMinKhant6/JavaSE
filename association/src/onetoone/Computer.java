package onetoone;

public class Computer {
	private String modal;
	private String brand;
	private MotherBoard motherboard;
	
	public Computer() {
		
	}
	public Computer(String modal, String brand, String serial , String mbmodal) {
		super();
		this.modal = modal;
		this.brand = brand;
		motherboard = new MotherBoard(serial , mbmodal);
	}
	
	public void PowerOn() {
		System.out.println("Computer is Starting ");
		motherboard.BootUp();
		System.out.println("Computer is started ... ");
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Computer [modal=" + modal + ", brand=" + brand + "]";
	}
	

	
}
