

import java.util.Scanner;

public class StairCase
{





public static void main(String [] args)
	{


Scanner scan= new Scanner(System.in);

System.out.println("Please enter number of steps in the  the Stair Case");
int num_steps= scan.nextInt();
System.out.println("Number of steps entered: " +num_steps);

method(num_steps);






}


public static void method(int n)
	{
int a[]=new int[n];
a[0]=1;
a[1]=1;
int number=0;

for (int i=2;i<n ;i++ )
{

a[i]=a[i-1]+a[i-2];

}

System.out.println("Fibnoccai Series is ");


for ( int i=0;i<=a.length-1 ;i++ )
{

System.out.println(a[i]);

}

System.out.println("Number of ways to climb the top of stair case are: "+a[a.length-1]);

}





}