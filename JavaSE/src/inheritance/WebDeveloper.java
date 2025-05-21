package inheritance;

public class WebDeveloper extends Developer {
	
	public WebDeveloper () {
		super();
		System.out.println("Inside WebDeveloper No args constructor");
	}
	public void createWebApp() {
		System.out.println(name + " creating web apps");
	}

}
