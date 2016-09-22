/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class indexmatch
{
	public void index(int a[])
	{
		int count=0;
		int b=a.length;
		
		
		for(int i=0;i<b;i++)
		{
			if(a[i]==i){
			System.out.println(a[i]);
			count++;
			}
		}
		if(count==0)
		{
			System.out.println("no match");
		}
	}
		
		
	
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
		
		indexmatch obj=new indexmatch();
		obj.index(ar);
	}
}
