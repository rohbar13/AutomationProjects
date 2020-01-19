package javademo.class1;

public class Fibonacci {

	public static void main(String[] args) {
		
		//1,1,2,3,5,8,13,21
		
		
		int lastval = 1;
		int nextval =1;
		
		System.out.println(lastval);
		
		for(int x=1;x<=10;x++) {
			
			int temp = nextval;
			nextval = lastval+nextval;
			lastval = temp;
			System.out.println(nextval);
			
		}
		
		
	}
	
}
