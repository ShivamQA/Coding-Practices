import java.util.Scanner;

public class Area extends Exception
{
	public void circle()
	{
		try
		{
			double rad, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input the radius of the circle");
			rad = ob.nextDouble();
			area = 3.14 * rad * rad;
			System.out.println("Area of Circle : "+area);
		}
		catch(Exception e){
			
			System.out.println("Exception occured : "+e);
		
		}
	}
	public void rectangle()
	{
		try
		{
			double len, breadth, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input Length of the rectangle");
			len = ob.nextDouble();
			System.out.println("Input Breadth of the rectangle");
			breadth = ob.nextDouble();
			area = len * breadth;
			System.out.println("Area of Rectangle : "+area);
		}
		catch(Exception e){
			
			System.out.println("Exception occured : "+e);
		
		}
	}
	public void square()
	{
		try
		{
			double side, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input side of the square");
			side = ob.nextDouble();
			area = side * side;
			System.out.println("Area of Rectangle : "+area);
		}
		catch(Exception e){
			
			System.out.println("Exception occured : "+e);
		
		}
	}
	public void triangle()
	{
		try
		{
			double base, alt, area;
			Scanner ob = new Scanner(System.in);
			System.out.println("Input base of the Triangle");
			base = ob.nextDouble();
			System.out.println("Input altitude of the Triangle");
			alt = ob.nextDouble();
			area = 0.5 * base * alt;
			System.out.println("Area of Triangle : "+area);
		}
		catch(Exception e){
			
			System.out.println("Exception occured : "+e);
		
		}
	}
	public static void main(String args[])
	{
		int choice;
		Area ar = new Area();
		Scanner ob = new Scanner(System.in);
		System.out.println("Input your choice to calculate the area:");
		System.out.println("\n\t1. Circle");
		System.out.println("\n\t2. Rectangle");
		System.out.println("\n\t3. Square");
		System.out.println("\n\t4. Triangle");
		choice = ob.nextInt();
		int i = 0;
		do
		{
			if(choice == 1) {
		
				ar.circle();
				i = 1;
		
			} 
			else if(choice == 2) {
			
				ar.rectangle();
				i = 1;
		
			} 
			else if(choice == 3) {
			
				ar.square();
				i = 1;
		
			}
			else if(choice == 4) {
			
				ar.triangle();
				i = 1;
		
			} 
			else {
			
				System.out.println("Please choose a valid choice among the menu.");
				System.out.println("Input choice again:");
				choice = ob.nextInt();
			}
		}while(i == 0);
	}
}
