package hello;

public class android {

	public static void main(String[] args) {
		String list = "tv";
		String productlist = "sony";
		
		switch(list){
		case "tv": System.out.println("wellcome to Tv world");
		switch(productlist){
		case "sony": System.out.println("Sony Tv is 1000Rs");
		break;
		case "mi": System.out.println("Mi Tv is 2000Rs");
		break;
		default : System.out.println("Not in the company");
		}
		break;
		case "nontv": System.out.println("wellcome to NonTv");
		break;
		default : System.out.println("Not matched");
		}

	}

}
