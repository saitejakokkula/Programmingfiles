package hello;

public class Test1 {

	public static void main(String[] args) {
	       int age = 24;
	       int income = 9000;
	       if(age>19) {
	    	   if(income<5000) {
	    		   System.out.println("loan is eligible");
	    	   }
	    	   else {
	    		   System.out.println("not eligible due to income");
	    	   }
	    	   }else{
	    		   System.out.println("not eligible due to age");
	       }

	}

}
