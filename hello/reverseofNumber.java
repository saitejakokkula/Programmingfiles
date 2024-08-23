package hello;

public class reverseofNumber {

	public static void main(String[] args) {
		
		int n = 237;
		int rev = 0;
		int r;
		while(n>0) {
			
			r = n%10;
			n = n/10;
			rev = rev*10+r;
			
		}
		System.out.println("Reverse of Number:"+rev);
	}

}
