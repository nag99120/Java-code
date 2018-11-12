package javapackage;

public class SmallestAndLargestInArray {

	public static void main(String[] args) {
		int numbers[]= {10,52,585566,12345555,-212252,-454};
		int largest=numbers[0];
		int smallest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			}
			System.out.println("the smaller number:"+smallest);
			System.out.println("the largest number:"+largest);
		}
	}

