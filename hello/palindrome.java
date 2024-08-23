package hello;

public class palindrome {

	public static void main(String[] args) {
		
		int n = 123321;
		int m = n;
		int rev = 0;
		int r;
		while(n>0) {
			
			r = n%10;
			n = n/10;
			rev = rev*10+r;
		}
		System.out.println(rev);
		if(rev == m) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is Not palindrome");
		}
	}

}
