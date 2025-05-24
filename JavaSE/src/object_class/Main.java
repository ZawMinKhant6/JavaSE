package object_class;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student student = new Student(1L,"MgMg","Civil",24);
		Student student2 = new Student(1L,"MgMg","Civil",24);
		Student student3= student;
		Student student4= new Student(2L,"ZawMinKhant","Civil",20);
		
		Student student5= new Student();
		Student student6 = new Student();
		
		System.out.println(student); // student.toString();
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student4.hashCode());
		System.out.println(student.toString());
		System.out.println(student.getClass().getName());
		System.out.println(student.hashCode());
		System.out.println("s1==s2 : " + student.equals(student2));
		System.out.println("s1==s3 : " + student.equals(student3));
		System.out.println("s1==s4 : " + student.equals(student4));
		System.out.println("s5==s6 : " + student5.equals(student6));
		
		Student s1Clone = (Student) student.clone();
		System.out.println("S1Cloned : "+ s1Clone);
		System.out.println("S1 == S1 Clone : " + s1Clone.equals(s1Clone));
	}

}
