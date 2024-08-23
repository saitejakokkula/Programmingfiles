package hii;

public class Test2 {

	public static void main(String[] args) {

		
	String h = "eyrertee868565865ASFFSAFSA@@^$@%$#%@";
	
	int lowercaseCount =0;
	int uppercaseCount =0;
	int numberCount = 0;
	int specialCharCount = 0;
	
	for(int i=0;i<h.length();i++) {
		char ch = h.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowercaseCount++;
		 }else if(Character.isUpperCase(ch)) {
			 uppercaseCount++;
		 }else if(Character.isDigit(ch)) {
			 numberCount++;
		 }else {
			 specialCharCount++;
		 }
		}
	    System.out.println("Number of lowercasecharacters:"+lowercaseCount);
	    System.out.println("Number of uppercasecharacters:"+uppercaseCount);
	    System.out.println("Number of numbers:"+numberCount);
	    System.out.println("Number of special characters:"+specialCharCount);
	}

}
