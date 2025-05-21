package encapsulaion;

//Pojo class / Plain odrinary objects
class Person {
	
	
	private String firstName;
	private String nrc;
	private Integer age;
	
	public Person() {
		
	}
	
	
	
	public Person(String firstName, String nrc, Integer age) {
		super();
		setName(firstName);
		setNrc(nrc);
		setAge(age);
	}



	public String getName() {
		
		return firstName;
	}
	public void setName(String firstName) {
		
		if(!(firstName.isBlank())) {
			this.firstName = firstName;
		}
		else this.firstName = "blankName";
		
		
	}
	
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		if(!(nrc.isBlank())) {
			this.nrc = nrc;
		}
		else this.nrc = "blankNrc";
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if(age > 0 ) this.age=age;
		else this.age= 1;
	}
	
	
	
}
