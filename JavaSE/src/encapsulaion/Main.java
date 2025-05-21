package encapsulaion;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person();
//		
//		person.setName("MgMg");
//		person.setNrc("12/blablabla");
//		person.setAge(23);
//		
//		Person newPerson = new Person("Masapal","12/blablabla",22);
//		newPerson.setAge(30);
		
		Person person = new Person("","",-11);
		
		
		System.out.println("Name : " + person.getName());
		System.out.println("Nrc : " + person.getNrc());
		System.out.println("Age : " + person.getAge());
	}

}
