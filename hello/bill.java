package hello;

public class bill {

	public static void main(String[] args) {
		
		//0-100 = 4            //100*4 = 400
		//101-200 = 8          //100*8 = 800   
		//201 - 300 = 20       //100*20 = 2000
		//301 - 400 = 25       //50*25 = 1250
		  int units = 350;
          double price;
          if(units<=100) {
        	  System.out.println("slab -1");
        	  price = 4;
        	  double bill = units*price;
        	  System.out.println(bill);
          }
          else if(units>=101 && units<=200) {
        	  System.out.println("slab -2");
        	  price = 8;
        	  double bill = (units-100) * price;
        	  System.out.println(bill);
          }
          else if(units>=201 && units<=300) {
        	  System.out.println("slab -3");
        	  price = 20;
        	  double bill = (units-200)*price +(400+800);
        	  System.out.println(bill);
          }
          else if(units>=301 && units<=400) {
        	  System.out.println("slab -4");
        	  price = 25;
        	  double bill = (units - 300)*price +(400+800+2000);
        	  System.out.println(bill);
          }

  }
}