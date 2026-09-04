package java_project;

public class create_an_array2 {

	public static void main(String[] args) {
		
		int x[]=new int[] {4,-1,3,17,-5,-14,19,10};
		System.out.println(searching(x,17));
	}

	public static int searching(int x[],int search)
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==search)
			{
				return 1;
			}
		} return 0;
	}
	
}
