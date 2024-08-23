package hello;

public class FB {

	public static void main(String[] args) {
		String username = "Teja";
		String password = "12345d";
		if(username == "Teja" && password == "12345"){
			System.out.println("login credential are correct ");
		}else{
			System.out.println("you credential are not correct");
			if(username=="Teja") {
				System.out.println("please re-collect security question");
			}else {
				System.out.println("we cannot find the username");
			}
		}

		

	}

}
