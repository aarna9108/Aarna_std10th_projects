package java_project;
import java.util.Scanner;
public class Uppercase_to_lowercase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the word");
		String a=scn.nextLine();
		String result="";
     int n= a.length();
     for(int i=0; i<n;i++)
     { 
    	 char c= a.charAt(i);
    	
    	 
    	 if((int)c>65 && (int)c<90)
    	 {
    		 char D=(char)(c+32);
    	     result=result+D;
    	 }
    	 else 
    	 {
    		 char D=(char)(c-32);
        	 result=result+D;
    	 }
    	 
    	 
    	 
    	 
    	 
     }System.out.println(result);
		
		
		
		
		
	}

}
