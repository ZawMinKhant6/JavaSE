package java_basics;

public class Employee {

	long id;
	String name;
	String email;
	String role;
	double salary;
	
	
	static void description() {
		System.out.println("This class is blueprint for employee object");
	}
	
	void method1() {
		System.out.println("Inside method1");
	}
	
	void method2() {
		System.out.println("Inside method2");
		description();
		this.method1(); // to show this is instance method; by applying this keyword;
	}
	 Employee(){
		System.out.println("Inside Employee No Arguments Constructor");
	}
	 
	 
	 
   Employee(String email,String role){ // do this // instead of giving new variable names;
		 
		 System.out.println("Inside Employee All Arguments Constructor");
		this.email=email;
		this.role=role;
		
	 }
	 
	 Employee(long updateId,String updateName,String updateEmail,String updateRole,double updateSalary){
		 
		 this("newEmail","new Role");
		 // this() can only call one recursive constructor;
		 System.out.println("Inside Employee All Arguments Constructor");
		 id=updateId;
		 name=updateName;
		// email=updateEmail;
		// role=updateRole;
		 salary=updateSalary;
	 }
	
	void update(long updateId,String updateName,String updateEmail,String updateRole,double updateSalary) {
		 id=updateId;
		 name=updateName;
		 email=updateEmail;
		 role=updateRole;
		 salary=updateSalary;
	}

}
