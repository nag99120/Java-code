package javapackage;
//Removing the spaces In a String
public class ReplaceSpeacesInASrting {

	public static void main(String[] args) {
		String str =new String("Nag reddy");
		System.out.println("The String With Spaces :"+str);
		str = str.replace(" ","");
		System.out.println("After removing the spaces in a string:"+str );
	}

}
