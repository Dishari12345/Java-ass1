// write a java program to calculate the power of a number.

import java.io.*;
import java.util.*;

class pp
{
	void power(int a,int b)
	{
		System.out.print("The power of that number: "+(int) Math.pow(a,b));   // here use Math.pow Function
	
	}
}
class power
{
	public static void main(String []a)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y=sc.nextInt();
		
		pp obj=new pp();
		obj.power(x,y);
	
	}
}
