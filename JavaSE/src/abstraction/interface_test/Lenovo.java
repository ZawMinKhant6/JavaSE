package abstraction.interface_test;

public class Lenovo implements PowerSystem,Circuit{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo Computer is powering on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo Computer is powering off");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo Computer is restarting");
	}

	@Override
	public void control() {
		// TODO Auto-generated method stub
		System.out.println("Curcuit is controlling lenovo computer");
	}
	
	
	@Override
	public void hibernate() {
		PowerSystem.super.hibernate();
		System.out.println("Lenovo computer is in hibernate State");
	}

}
