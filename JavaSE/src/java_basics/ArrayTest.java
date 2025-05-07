package java_basics;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3D Array
		
		int[][][] sales= {
				{//Yangon
					{//Dec
						80, // Laptop
						120,//phone
						300 //powerbank
					},
					{100,200,500}, //Apr
					{60,157,660} //Aug
				},
				{//Mandalay
					{50,90,220},{90,130,330},{70,110,223}
				},

		}; 
		
		System.out.println("Yangon, Aug , Phone = " + sales[0][2][1]);
		System.out.println("Mandalay, Dec , PowerBank = " + sales[1][0][2]);
		
		//2D array
		
//		int[][] marks = new int[3][4];
		
		
//		marks[0][0]=170;
//		marks[0][1]=150;
//		marks[0][2]=180;
//		marks[0][3]=170;
//		
//		marks[1][0]=140;
//		marks[1][1]=190;
//		marks[1][2]=180;
//		marks[1][3]=150;
//		
//		marks[2][0]=160;
//		marks[2][1]=170;
//		marks[2][2]=200;
//		marks[2][3]=180;
		
		
		// initialize
//		int[][] marks = {{170,150,180,170},{140,190,180,150},{160,170,200,180}};
		
		//MgMg Science
		
//		System.out.println("Mg Mg Science Mark = " + marks[0][3]);
//		System.out.println("Ma Sapal Science Mark = " + marks[1][2]);
//		System.out.println("Ye Ye Math Mark = " + marks[2][0]);
		
		
//		System.out.println(marks.length);
		
		// initialized 2 way
		//
		//int[] marks={70,90,100,67,88,99,120}; 
		
		int[] marks= new int[]{70,90,100,67,88,99,120}; // the size will depend on the data you add;
		
		//declare
		
		// int[] marks = new int[6];
		
		
		marks[0]=70;
		marks[1]=90;
		marks[2]=100;
		marks[3]=67;
		marks[4]=88;
		marks[5]=99;
		
		System.out.println(marks);
		System.out.println("Index length = " + marks.length);
		System.out.println("index - 0 = "+marks[0]);
		System.out.println("index - 1 = "+marks[1]);
		System.out.println("index - 2 = "+marks[2]);
		System.out.println("index - 3 = "+marks[3]);
		System.out.println("index - 4 = "+marks[4]);
		System.out.println("index - 5 = "+marks[5]);
		System.out.println("index - 6 = "+marks[6]);

		
	}

}
