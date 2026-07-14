package java_project;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	System.out.println("Enter the radius");	
	double radius=scn.nextDouble();
	System.out.println("Enter the choice");
	System.out.println("1.Circumference");
	System.out.println("2.Diameter");
	System.out.println("3.Area");
	System.out.println("Enter the choice");
	int choice= scn.nextInt();
	
	switch(choice) {
	case 1: System.out.println("The circumference of the circle is "+2*3.14*radius);
	//break;
	
	case 2: System.out.println("The diameter of the circle is "+2*radius);
	break;
	
	case 3: System.out.println("The arewa of the circle is "+2*radius*radius);
	break;
	default: System.out.println("Invalid choice");
	}
	
	
	
	
	
	

	}

}
