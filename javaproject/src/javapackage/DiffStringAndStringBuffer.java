package javapackage;

public class DiffStringAndStringBuffer {

	public static void main(String[] args) {
		String s = new String("nag");
		s.concat("arjun");
		System.out.println(s);//output is nag only..bcoz String is immutable
		StringBuffer br = new StringBuffer("nag");
		br.append("arjuna");
		System.out.println(br);//output is nagarjuna
	}

}
