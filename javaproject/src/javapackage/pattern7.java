package javapackage;

public class pattern7 {

	public static void main(String[] args) {
		int i ,j;
		{
		for(i=0;i<=5;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			 System.out.println("");

		}
		int k ,l;
		for(k=0;k<=4;k++)
		{
			for (l=k;l<=4;l++)
			{
				System.out.print("*");
			}
			 System.out.println("");

		}
	}

	int p, q, r;{
	for (p = 1; p<=5; p++) {
		for (r =4;r>=p; r--) {
			System.out.print(" ");
		}

		for (q = 1; q <= p; q++) {
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
}


