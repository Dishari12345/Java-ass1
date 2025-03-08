//write a java program to print the following sequence:2,1,4,2,6,6,24,10 and so on up to a given limit.

import java.io.*;
import java.util.*;
class Seq
{
	void sequ(int num){
		int i, a=1;
		for(i=1;i<=num;i++){
		a*=i;
		System.out.print((2*i)+", "+a+", ");
		
		}
	}
}

class Sequence{

	public static void main(String a[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number you want to print the sequence:");
		n=sc.nextInt();
		Seq obj=new Seq();
		obj.sequ(n);
	}
}
