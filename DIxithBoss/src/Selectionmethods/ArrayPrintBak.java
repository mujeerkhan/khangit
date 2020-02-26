package Selectionmethods;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayPrintBak {
	
	public static void readNvalue() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Elements Read");
		int n=s.nextInt();
		int []Array=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<Array.length;i++)
		{
			Array[i]=s.nextInt();
			System.out.println("print the value");
		}
	}
	
	public static int[] OrderValue(int []Array)
	{
	
		
		for(int i=0;i<Array.length-1;i++)
		{
			int pos=i;
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[pos]>Array[j])
				{
					pos=j;
				}
				if(pos!=i)
				{
					int temp=Array[i];
					Array[i]=Array[pos];
					Array[pos]=temp;
				}
			}
		}
		return Array;
	}
}
