package javapackage;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[][]=new int[5][2];
		arr[0][0]=55;
		arr[1][0]=66;
		arr[2][0]=77;
		arr[3][0]=99;
		arr[4][0]=22;
		arr[0][1]=63;
		arr[1][1]=54;
		arr[2][1]=15;
		arr[3][1]=95;
		arr[4][1]=25;
//		for(int i=0;i<arr.length;i++)//for loop
//		{
//			for(int j=0;j<arr[i].length;j++) 
		
		for(int[] x:arr){
			for(int y:x)	//for each loop 
		{
		System.out.println("the Array is:"+y+" ");

	}
		
	}
}
}

