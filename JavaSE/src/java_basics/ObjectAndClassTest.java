package java_basics;

public class ObjectAndClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.numberOfWheels=4;
		System.out.println("Number of Wheels "+ Car.numberOfWheels);
		
		System.out.println(new Car());// create car object on heap memory;
		System.out.println(new Car().brand);
		
		Car ciaz = new Car();
		ciaz.brand="Niisan";
		ciaz.model="Ciaz 2202";
		ciaz.price=4000.345;;
		ciaz.year=2022;
		ciaz.speedPerKM=100;
		//ciaz.numberOfWheels=8;
		
		ciaz.engineStart();
		ciaz.drive();
		ciaz.horn();
		ciaz.brake();
		ciaz.information();
		
		Car hilux = new Car();
		hilux.brand="hilux-GT";
		hilux.price=120000.22;
		hilux.year=2023;
		hilux.speedPerKM=200;
		
		hilux.engineStart();
		hilux.drive();
		hilux.horn();
		hilux.brake();
		hilux.information();
		//System.out.println(hilux.numberOfWheels);
		//System.out.println(ciaz.numberOfWheels); // should not do this;
	}

}
