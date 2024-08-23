package hello;

public class hii {

	public static void main(String[] args) {
		String username = "Sai";
	    String password = "123v";
	    int age = 23;
	    String address = "Mallial";
	    if(username =="Sai" && password == "123v"){
	        System.out.println("login successfully");
	    }
	    else{
	        System.out.println("your credential are not correct");}
	        if(age>15){
	            System.out.println("your are eligible to the coures");
	            if(address == "Mallial"){
	                System.out.println("username is correct");
	            }else{
	                System.out.println("try again");
	            }
	        }else{
	            System.out.println("your are not eligible to take the coures");
	        }

	}

}
