package java_project;
import java.util.Scanner;
public class StepTracker {
	
	String name;
	int sw;
	double cb;
	double km;
	Scanner scn= new Scanner(System.in);
	
	public void accept() {	
	 System.out.println("Enter your name ");
	 name=scn.next();
	 System.out.println("Enter the number of steps ");
	 sw=scn.nextInt();
	}
	public void calculate() {
		cb=0.04*sw;
		km=(sw*1.0)/1300;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("km:"+km);
		System.out.println("cb:"+cb);
	}
	public static void main(String[] args) {
		
		StepTracker stp=new StepTracker();
		stp.accept();
		stp.calculate();
		stp.display();
	}

}
