package abstraction.interface_test;

public class MiTV extends TV implements PowerSystem,Circuit {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("MiTV is powering On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("MiTV is powering Off");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("MiTV is restarting");
	}

	@Override
	void rendermedia() {
		// TODO Auto-generated method stub
		System.out.println("MiTv show Media");
	}

	@Override
	public void control() {
		// TODO Auto-generated method stub
		System.out.println("Circuit is Controlling MiTV");
	}

}
