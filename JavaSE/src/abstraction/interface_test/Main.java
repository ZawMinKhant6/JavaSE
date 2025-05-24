package abstraction.interface_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerSystem ps= new PanasonicFan();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		
		
		
		ps = new MiTV();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		
		if(ps instanceof MiTV) {
			MiTV miTV = (MiTV) ps;
			miTV.rendermedia();
			miTV.control();
			
		}
		
		if(ps instanceof TV) {
			TV tv = (TV) ps;
			tv.rendermedia();
		}
		
		TV tv = new SamsungTV();
		tv.rendermedia();
		
		ps = new Lenovo();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		
//		Lenovo lenovo = (Lenovo) ps;
//		lenovo.control();
		
		Circuit circuit = (Circuit) ps;
		circuit.control();
		
		LuminousInverter luminous  = new LuminousInverter();
		luminous.hibernate();
		
		System.out.println(PowerSystem.TYPE);
		
	
	}

}
