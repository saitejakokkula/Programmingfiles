package hello;

public class Test {

	public static void main(String[] args) {
		double bill = 105;
		double discount1,discount2;
		discount1 = bill/100*10;
		discount2 = bill/100*20;
		double fbill;
		if(bill<=100) {
			fbill = bill - discount1;
			System.out.println(discount1);
			System.out.println("The 10% discount is applicable:" + fbill);
		}else {
			fbill = bill - discount2;
			System.out.println(discount2);
			System.out.println("The 20% discount is applicable:" + fbill);
		}

	}

}
