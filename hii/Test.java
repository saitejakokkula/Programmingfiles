package hii;

public class Test {

	public static void main(String[] args) {
		String name = "Sai";
		String password = "sa123";
		int age = 25;
		if(name == "Sai" && password == "sa123") {
			System.out.println("your are login successfull"); 
		}else {
			System.out.println("your login credential not correct");
		}
			if(age>26) {
				System.out.println("your are eligible access course");
				if(name == "Sai") {
					System.out.println("your name is correct");
				}else {
					System.out.println("try again");
				}
			}else {
				System.out.println("your are not eligible access course");
		}

	}

}
