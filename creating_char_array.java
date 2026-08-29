package java_project;
import java.util.Scanner;
public class creating_char_array {

	public static void main(String[] args) {
	

		Scanner scn=new Scanner(System.in);
         char ch[]=new char[5];
		for(char i=0;i<5;i++)
		{ ch[i]= scn.next().charAt(0);
			
		}
		for(char i=0;i<5;i++)
		{
			System.out.println(ch[i]);
			
	}

}
}