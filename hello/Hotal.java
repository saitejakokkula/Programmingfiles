package hello;

public class Hotal {

	public static void main(String[] args) {
		String flist = "veg";
		String order = "vegfriedrice";
		switch(flist){
		case "veg": System.out.println("Wellcome to Veg world");
		switch(order) {
		case "paneer": System.out.println("paneer is 250Rs");
		break;
		case "vegfriedrice": System.out.println("vegfriedrice is 80Rs");
		break;
		default :System.out.println("Not order");
		}
		break;
		case "nonveg": System.out.println("wellcome to Nonveg");
		switch(order) {
		case "chicken": System.out.println("paneer is 150Rs");
		break;
		case "chickenfriedrice": System.out.println("chickenfriedrice is 80Rs");
		break;
		default :System.out.println("Not order");
		}
		break;
		default : System.out.println("Not matched");
		}
		
	}

}
