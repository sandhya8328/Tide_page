package Surf;

import java.util.Scanner;

class One
{

	public static void main(String[] args)
	{ 
	int a[]= new int[5]; int temp;
	Scanner r= new Scanner(System.in);
	System.out.println("enter elements in array");
	{
	int i,j,j1;
	for (i=0;i<5;i++)
	{
		a[i]=r.nextInt();
	}
	for (i=0;i<5;i++)
	{
		for (int j1 =j1+1 ;j1<5;j1++)
		{
			if(a[i]>a[j1])
			{
				temp=a[i];
				a[i]=a[j1];
				a[j1]=temp;
			}
		}
	}
	for (i=0;i<5;i++)
	{
		System.out.println(a[i]+" ");
	}
	}
	
	
		// TODO Auto-generated method stub

	}

}
