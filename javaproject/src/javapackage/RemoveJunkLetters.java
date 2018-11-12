package javapackage;

public class RemoveJunkLetters {

	public static void main(String[] args) {
		String S = "//656565 My name is Nag---+++++//*-++++";
		//Regulor Expression--[^a-zA-Z0-9]
		    String S1=S.replaceAll("[^a-zA-Z0-9]", "");
		    //Replace a word with other word
		 String S2=S.replace("name", "lo");
		    //index of ch
		    int S3=S.indexOf("M");
		    
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		
				
	}
	

}
