package javapackage;

import java.util.Scanner;

public class Fibonacci {
//0 1 1 2 3 5 8 13 21 34 55
	public static void main(String[] args) {
//		int i,j=1,k=1;
//		Scanner sc =new Scanner(System.in);
//		i=0;
//		System.out.println("enter the number");
//		int n = sc.nextInt();
//		System.out.print("1 1 ");
//		for(i=0;i<=n;i++) 
//		{
//			i=j+k;
//			if(i>=n)
//			break;
//			System.out.print(i+" ");
//			j=k;
//			k=i;
//			
//		}
		//Second method of the fibonacci
		  int num=10;
		  /*Scanner in =new Scanner(System.in);
		  System.out.println("Enter number");
		  num=in.nextInt();*/
		  int f1,f2=0,f3=1;
		  System.out.print(f2+" ");
		  System.out.print(f3+" ");
		  for(int i=1;i<=num;i++)
		  {
			  f1=f2;
			  f2=f3;
			  f3=f1+f2;
			  System.out.print(f3+" ");
		  }
			}
	}


