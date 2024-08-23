package hello;

public class login {

	public static void main(String[] args) {
		String username = "Sai";
		String password = "123d";
		String fname = "madhiva";
		String sname = "akshita";
		if(username == "Sai"&& password == "123d") {
			System.out.println("login successfull");
		}
		else {
			System.out.println("login details are not correct");
			if(username == "Sai") {
				System.out.println(" re-collect scurity question");
				if(fname == "madhiva" && sname == "aksthita") {
					System.out.println("password--"+password);
				}
				else {
					System.out.println("you can try again");
				}
			}
			else {
				System.out.println("we can not finding username");
			}
		}
				
	}

}
