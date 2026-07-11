package java_project;
import java.util.Scanner;
public class String_ut1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String a=scn.nextLine();
		int b= a.length();
		System.out.println("The length of the following stirng is "+b);
		String c=a.toUpperCase();
		System.out.println("The following string in upper case "+c);
		String d=a.substring(3);
		System.out.println("The substring for the following string from index 3 is "+d);
		

	}

}
