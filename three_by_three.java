package java_project;
import java.util.Scanner;
public class three_by_three {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=scn.nextInt();
			}
			
			}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println("The sum of the matrix is:");
		System.out.println(sum);
	
	
	
	}
	}
