package javademo.class1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//prime number : which is only divisible by itself or 1
		
		//ex 3,5,7,11,13,17,19,23
		
		//find all the prime number between 1 to 100.
		//if a particular number is prime or not let say 37
		
		int num = 37;
		
		int counter = 0;
		
		for(int x=2;x<num/2;x++) {  //dividing number by 2 as any number cannot be divided by above half of its value except itself
			if(num % x ==0) {
				counter++;
			}
		}
		
		if(counter>0) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
		
		
	}
	
}
