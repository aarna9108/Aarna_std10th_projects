package java_project;
import java.util.Scanner;
public class Sum_Of_numbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number set");
		int x[]=new int[10];
		
		for(int i=0;i<10;i++)
		{
			x[i]=scn.nextInt();
	    }
		int sum1=0;
		int sum2=0;
		for(int i=0;i<x.length;i++)
		{
			if((x[i]>=0&&x[i]<=9)||(x[i]>=-9&&x[i]<=-1))
			{
				sum1+=x[i];
				System.out.println("The sum of one digit numbers are"+sum1);
			}
			else if((x[i]>=10&&x[i]<=99)||(x[i]>=-99&&x[i]<=-10))
			{
				sum2+=x[i];
				System.out.println("The sum of the two digit numbers are"+sum2);
			}
		}
			System.out.println(sum1);
			System.out.println(sum2);
}
}