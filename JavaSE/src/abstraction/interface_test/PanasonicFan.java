package abstraction.interface_test;

public class PanasonicFan implements PowerSystem {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Panasonic Fan is powering on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Panasonic Fan is powering off");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("Panasonic Fan is restarting");
	}

}
