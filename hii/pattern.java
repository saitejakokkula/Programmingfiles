package hii;

public class pattern {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=10;i++) {
			System.out.println("tables-----"+i);
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}*/
		
		/*int sum = 0;
		for(int i=0;i<=5;i++) {
			sum = sum+i;
		}
		System.out.println("Total Sum  :"+sum);*/
		
		/*int fact = 1;
		for(int i=1;i<=5;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial:"+fact);*/
		
		/*int n = 2359;
		int count = 0;
		while(n>0) {
			
			n = n/10;
			count++;
		}
		System.out.println("Total count:"+count);*/
		
		/*int r;
		int n = 123;
		int m =n;
		int sum = 0;
		while(n>0) {
			
			r = n%10;
			n = n/10;
			sum = sum+r*r*r;
		}
		System.out.println(sum);
		if(sum== m) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}*/
		
		int n = 123;
		int m = n;
		int rev = 0;
		int r;
		while(n>0) {
			
			r = n%10;
			n = n/10;
			rev = rev*10+r;
			System.out.println("Reverse Number:"+rev);
		} 
		if(rev == m) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
