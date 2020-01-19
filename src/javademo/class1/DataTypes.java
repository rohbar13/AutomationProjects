package javademo.class1;

public class DataTypes {

	int y = 20; //instance variable [instance is an object or real time entity]  
	
	public static void main(String[] args) {
	}
	
	public void method1() {
		int x = 10; //local variable
		System.out.println(y);
	}

	public void method2 () {
		System.out.println(y); // instance variable is accessible throughout the class
		//System.out.println(x);
		//x will give a compile time error as x is a local 
		//variable and cannot be used outside the method in which it was declared
 	}
	

}
