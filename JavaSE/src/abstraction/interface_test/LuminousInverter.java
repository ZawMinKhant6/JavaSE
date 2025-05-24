package abstraction.interface_test;

public class LuminousInverter implements PowerSystem {


	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Luminous is powering On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Luminous is powering Off");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("Luminous is restarting");
	}

	
	@Override
	public void hibernate() {
		PowerSystem.super.hibernate();
		System.out.println("Luminous Inverter is in hibernate State");
	}
}
