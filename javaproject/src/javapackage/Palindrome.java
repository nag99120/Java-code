package javapackage;

public class Palindrome {

	public static void main(String[] args) {
	 String orinal= new String("nag");
	 String revers="";
	 int size =orinal.length();
	 for(int i=size-1;i>=0;i--) {
		 revers=revers+orinal.charAt(i);
	 }
	 if(orinal.equals(revers)) {
		 System.out.println("the string is polindrome:"+" "+revers);
	 }else {
	 System.out.println("The string is not palindrome:"+" "+revers);
		 
	 }

	}
}

