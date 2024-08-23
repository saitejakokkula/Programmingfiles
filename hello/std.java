package hello;

public class std {
	public static void main(String args[]){
        String username = "Raju";
		String password = "sai123";
		int age = 18;
		if(username == "Raju" && password == "sai123"){
			System.out.println("login successfully");
		}
		else{
			System.out.println("your login credential are not correct");}
			if(age>20){
			    System.out.println("you eligible to access the course");
			    if(username =="Raja"){
			        System.out.println("you registered asper collage required");
			    }
			    else{
			        System.out.println("please try fill the form asper required to the collage");
			    }
			}else{
			    System.out.println("you can't access the course");
			}
    }
}


