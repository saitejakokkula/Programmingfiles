package hello;

public class output {
	
	void hhh( double bill ,double dis) {
		System.out.println("Total bill-"+bill);
		System.out.println("Discount Amount-"+dis);
		double finaldis =  (bill/100)*dis;
		double totalbill = bill - finaldis;
		System.out.println("finaldis is ---"+finaldis);
		System.out.println("totalbill is---"+totalbill);
		
	}

	public static void main(String[] args) {
		//0-9999 = 10
		//10000-19999 = 20
		//20000-29999 = 30
		//30000
		double bill = 5000;
		double dis;
		
		output v = new output();
		
		if(bill>0 && bill<=9999) {
			dis = 5;
			v.hhh(bill,dis);
			
		}else if(bill>=10000 && bill<=19000){
			dis = 10;
			v.hhh(bill,dis);
			
		}else if(bill>=20000 && bill<=29999) {
			dis = 15;
			v.hhh(bill,dis);
			
		}else {
			dis = 20;
			v.hhh(bill,dis);
			System.out.println("big basket");
		}
		
		
	}

}
