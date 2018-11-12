package javapackage;

public class pattern6 {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i<=5; i++) {
			for (k =4;k>=i; k--) {
				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		int a, b, c;
		for (a = 1; a<=5; a++) {
			for (c =1;c<=a; c++) {
				System.out.print(" ");
			}
			for (b =a; b<=4; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
	}



