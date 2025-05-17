package com.hostmdy.test;
//
import com.hostmdy.other.C;
import com.hostmdy.other.D;
//import com.hostmdy.other.*; // should not use // bad practice;
//import com.hostmdy.another.C;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.methodOne();
		
		C c =new C ();
		c.methodC();
		
		C c1 =new C ();
		c1.methodC();
		
		com.hostmdy.another.C c2 = new com.hostmdy.another.C();
		c2.methodC();
		
		D d = new D();
		d.methodD();
		
	}

}



// compiler convert

//public class com.hostmdy.test.A {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		com.hostmdy.test.B b = new com.hostmdy.test.B();
//		b.methodOne();
//	}
//
//}