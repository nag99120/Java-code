package javapackage;

public class OccurenceOfLetters {

	public static void main(String[] args) {
	   String str =new String("aaaabbbddddccccggghgffxkkkkjkjjkjjj");
	   char[] ch = str.toCharArray();
	   int size = ch.length;
	   int i = 0,j= 0,counter= 0;
	   for(i=0;i<size;i++) {
		   counter=0;{
			   for(j=0;j<size;j++) {
				   if(j<i&&ch[j]==ch[i]) {
					   break;   
				   }
				   if(ch[j]==ch[i]) {
					   counter++;
				   }
				   if(j==size-1) {
					   System.out.println("The Occurence of "+ch[i]+"is present "+counter+"times");
				   }
			   }
		   }
		   
	   }
	}

}
