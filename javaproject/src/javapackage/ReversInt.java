package javapackage;

public class ReversInt {

	public static void main(String[] args) {
		int num=2535656;
	    int rev=0;  
	    while(num!=0) {
	    	rev=rev*10+num%10;//3
	    	num=num/10;
	    }
		System.out.println("The reverse number is:"+rev);
		
	}

}
