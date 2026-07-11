package java_project;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the grade of the following student:");
		int grade= scn.nextInt();
		
		if(grade>80 && grade<100) {
			
			System.out.println("A");
		}
		else if(60<=grade && grade<=80) {
			System.out.println("B");
		}
		else if(40<=grade && grade<=60) {
			System.out.println("c");
			
		}else
		{
			System.out.println("D");
		}
		
		
		
		
		
		

	}

}
