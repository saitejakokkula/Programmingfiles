package hello;

public class input {
	
	void add(int a, int b) {
		System.out.println("start of add method");
		System.out.println("add----"+(a+b));
		System.out.println("end of add method");
	}
	void sub(int a, int b) {
		System.out.println("start of sub method");
		System.out.println("sub----"+(a-b));
		System.out.println("end of sub method");
	}
	void mul(int a, int b) {
		System.out.println("start of mul method");
		System.out.println("mul----"+(a*b));
		System.out.println("end of mul method");
	}
	void mod(int a, int b) {
		System.out.println("Start of mod method");
		System.out.println("mod----"+(a%b));
		System.out.println("end of mod method");
	}
	void div(int a, int b) {
		System.out.println("Start of div method");
		System.out.println("div-----"+(a/b));
		System.out.println("end of div method");
	}

	public static void main(String[] args) {
		
		input v = new input();
		v.add(5, 6);
		System.out.println("------------------");
		v.sub(10, 8);
		System.out.println("------------------");
		v.mul(5, 5);
		System.out.println("------------------");
		v.mod(25, 32);
		System.out.println("------------------");
		v.div(44, 38);
		System.out.println("------------------");
	}

}
