package javapackage;
//Method overloading 
//1.same method name with different signature
//use:::flexibility of the code..means depends up on requirement +
//show method can be called//
//compler time polymorphism -->the behaviour will decide by complier time
//binding will happen early -->it call as early binding or static binding 
public class polymorphosm {
	//If use static ,we can directly invoke with method name
	static void show() {
		System.out.println("No parameter");
	}
	 static void show( int x) {
		System.out.println("integer parameter:"+" "+x);
	}
	 //If dont use static at method  then we need create Object of that class 
	void show(int x,int y) {
		System.out.println("Two interger parameters:"+" "+x+ "  "+y);
	}
	public static void main(String[] args) {
		polymorphosm obj = new polymorphosm();
		show();
		show(25);
		obj.show(32, 25);
	}

}
