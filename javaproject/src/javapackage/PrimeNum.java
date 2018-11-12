package javapackage;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		boolean isprime =true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
	    int num = sc.nextInt();
		for(int i=2;i<num;i++)
		
		{
			if(num%i==0)
			{
            isprime=false;
            break;
			}
			}
			if(isprime)
				System.out.println(num+" " + "is prime number");
		else {
			System.out.println("the number is not prime");
		}
		}
	}
		
	


