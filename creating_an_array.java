package java_project;
import java.util.Scanner;
public class creating_an_array {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);

	int x[]=new int[10];
	
	for(int i=0;i<10;i++)
	{
		x[i]=scn.nextInt();
	
	
	}
	for(int i=0;i<10;i++)
	{
		System.out.println(x[i]);
	}
	
	
	}

	}
