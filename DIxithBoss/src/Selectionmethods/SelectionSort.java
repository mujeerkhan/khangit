package Selectionmethods;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number values to be read");
	int n=s.nextInt();
	int []a=new int [n];
	System.out.println("Enter the value");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	
	System.out.println("print the value");
	}
    for(int i:a)
    {
		System.out.println(i);
	}
	
	}
	}
