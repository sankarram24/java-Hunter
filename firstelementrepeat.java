/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class firstelementrepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		int count,num=0;
		
	/*	for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}*/
		for(int i=0;i<n;i++)
		{
		//	System.out.println("*");
			count=0;
			for(int j=0;j<n;j++)
			{
				
				if(ar[i]==ar[j])
				{
					count++;
					num++;
				}
				
			}
			if(num==1)
			{
				num=0;
			}
			
			if(count==2 && num==2)
				{
					System.out.println(ar[i]);
				}
		}
	}
}
