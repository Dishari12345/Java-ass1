//write a java program to display factors of a number.

import java.io.*;
import java.util.*;
class F
{
    void number(int num)
    {
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
class fact
{
    public static void main(String []a)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a=sc.nextInt();
        F obj=new F();
        obj.number(a);
    }
}
