package javapackage;

public class StringRevers {
	//output is "gan"

	public static void main(String[] args) {
		String name="nag";//here you can give number(123) also.output is 321
		int len =name.length();
		System.out.println("Original size:"+len);
		String Rev="";// first Rev null
		for (int i=len-1;i>=0;i--)
		{
			Rev = Rev+name.charAt(i);
		}
		System.out.println("Revers String:"+Rev);
	}
}
