package hello;

public class electricalbill {
	public static void main(String[] args) {
	int   usertype = 2;
	int units = 150;
	int price;
	
	switch(usertype){
	case 1: 
	if(units<=100) {
	   System.out.println("slab -1");
	price = 4;
	double bill = units*price;
	System.out.println("your electricalbill is:"+bill);
	}else {
		System.out.println("your is not correct");
	}
		break;
	case 2 :
		if(units >= 101 && units <= 201) {
			System.out.println("slab -2");
			price = 3;
			double bill = (units-100)*price+400;
			System.out.println("you electricalbill is:"+bill);
		}else {
			System.out.println("your is units more than 200");
		}
			
		break;
		default: 
			System.out.println("Invalid usertype");
	 }

   }
	
}