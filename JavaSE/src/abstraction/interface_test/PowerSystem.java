package abstraction.interface_test;

public interface PowerSystem extends Fuse {
	
	 static String TYPE = "DIGITAL"; //static final variable;
	  
	 void powerOn();
	 void powerOff();
	 void restart();
	 
	 
	 
	 default void hibernate() {
		 System.out.println("Hibernate Function");
	 }
	 
	 @Override
	 default void powerCutAll() {
		 System.out.println("Power Cut All Function");
	 }
	 
	 static void description() {
		 System.out.println("This interface is for classes that has power system");
	 }
	 
	 
	 
	 
}
