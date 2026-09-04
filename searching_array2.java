package java_project;

public class searching_array2 {

	public static void main(String[] args) {
		
		int x[]=new int[] {12,15,35,38,45};
		System.out.println(searching(x,39));
		
	}
	public static int searching(int x[],int search)
	{
		for(int i=0;i<x.length;i++)
	
		{
			if(x[i]==search)
			{
				return 1;
			}
		} 
		return 0;
	}

}
