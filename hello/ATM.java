package hello;

public class ATM {

	public static void main(String[] args) {
		     int pin = 4567;
		     int balance = 6000;
		     int wd = 4000;
		     
		     if(pin==4567) {
		    	 System.out.println("Wellcome to union Bank");
		    	 if(wd<balance) {
		    		 System.out.println("Succefully withdraw--"+(balance-wd));
		    	 }
		    	 else {
		    		 System.out.println("Insuff Amount");
		    	 }
	         }
		     else {
		    	 System.out.println("Incorrect pin");
		     }

}
}
