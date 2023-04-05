/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=scan.nextInt();
		    int y=scan.nextInt();
		    int z=y-x;
		    int count=0;
		     for(int j=y;j<x;j++)
		    {
		        
		        count++;
		        z=y+count*(count+1)/2;
		        
		        if(z>=x)
		        {
		            break;
		        }
		       
		       
		    }
		      System.out.println(count);   
		 
		    
		} 
	}
}
