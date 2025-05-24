package abstraction.interface_test;

public class SamsungTV extends TV implements PowerSystem {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv is powering On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv is powering Off");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv is restarting");
	}
	
	@Override
	void rendermedia() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Tv SHow media");
	}

}
