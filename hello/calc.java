package hello;

public class calc {
	
	int a;
	int b;
	void add() {
		System.out.println("Start of add method");
		a = 20;
		b = 8;
		System.out.println("add---"+(a+b));
		System.out.println("end of add method");
	}
	void sub() {
		System.out.println("Start of sub method");
		System.out.println("sub---"+(a-b));
		System.out.println("end of sub method");
	}
	void mal() {
		System.out.println("Start of mal method");
		System.out.println("mal---"+(a*b));
		System.out.println("end of mal method");
	}

	public static void main(String[] args) {
		
		calc c = new calc();
		c.sub();
		System.out.println("--------------");
		System.out.println("wellcome");
		c.add();
		System.out.println("---------------");
		System.out.println("hi");
		c.sub();
		System.out.println("-----------------");
		c.mal();
		
		
	}

}
