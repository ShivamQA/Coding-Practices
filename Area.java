import java.util.Scanner;
/** 
 A class for calculating areas
**/
class Area extends Exception
{
	public void circle() //Calculates area of circle
	{
		try {

			double rad, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input the radius of the circle:");
			rad = ob.nextDouble();
			area = 3.14 * rad * rad;
			System.out.println("Area of circle:"+area);

		}
		catch(Exception e) {

			System.out.println("Sorry following Exception is occured:"+e);

		}
	}
	public void rectangle() //Calculates area of rectangle
	{
		try {

			double len, breadth, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input the length of rectangle:");
			len = ob.nextDouble();
			System.out.println("Input the breadth of rectangle");		
			breadth = ob.nextDouble();	
			area = len * breadth;
			System.out.println("Area of Rectangle:"+area);

		}
		catch(Exception e) {

			System.out.println("Sorry following Exception is occured:"+e);

		}
	}
	public void square() //Calculates area of square
	{
		try {

			double side, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input the side of square:");
			side = ob.nextDouble();
			area = side * side;
			System.out.println("Area of Square:"+area);

		}
		catch(Exception e) {

			System.out.println("Sorry following Exception is occured:"+e);

		}
	}
	public void triangle() //Calculates area of triangle
	{
		try {

			double base, alt, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input the base of Triangle:");
			base = ob.nextDouble();
			System.out.println("Input the altitude of Triangle");		
			alt = ob.nextDouble();	
			area = 0.5 * base * alt;
			System.out.println("Area of Triangle:"+area);

		}
		catch(Exception e) {

			System.out.println("Following Exception is occured:"+e);

		}
	}
	public static void main(String[] args)
	{
		Area ar = new Area();
		int choice, loop = 0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Input your choice from the menu to calculate the area of");
		System.out.println("\n\t1. Circle");
		System.out.println("\n\t2. Rectangle");
		System.out.println("\n\t3. Square");
		System.out.println("\n\t4. Triangle");
		choice = ob.nextInt();
		do {
		
			if(choice == 1) {
			
				ar.circle();
				loop = 1;
	
			}
			else if(choice == 2) {
				
				ar.rectangle();
				loop = 1;

			}
			else if(choice == 3) {
	
				ar.square();
				loop = 1;
	
			}
			else if(choice == 4) {

				ar.triangle();
				loop = 1;
	
			}
			else {
	
				System.out.println("\n\tYou have entered invalid option");
				System.out.println("\n\tInput your choice again:");
				choice = ob.nextInt();
			
			}
		} while(loop == 0);
	}
}		
