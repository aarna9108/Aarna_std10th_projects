package java_project;
import java.util.Scanner;
public class twoD_array {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int arr[][]=new int[2][4];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=scn.nextInt();
			}
			
			}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
