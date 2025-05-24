package abstraction.interface_test;

public interface Circuit {
      void control();
      
     default void aiControl() {
    	  basicAi();
    	  System.out.println(" Control Ai Feature");
      }
     
     default void aiAssistance() {
    	  basicAi();
	   	  System.out.println("Assistance AI Feature");
     }
     
     private void basicAi() {
    	  System.out.println("Basic Control Feature 1");
	   	  System.out.println("Basic Control Feature 2");
	   	  System.out.println("Basic Control Feature 3");
	   	  System.out.println("Basic Control Feature 4");
	   	  System.out.println("Basic Control Feature 5");
	   	  System.out.println("Basic Control Feature 6");
     }
}
