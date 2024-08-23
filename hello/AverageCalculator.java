package hello;

public class AverageCalculator {
	
	void average(double a,double b ,double c){
		double average = (a + b + c) / 3;
        System.out.println("The average is: " + average);
	}

	public static void main(String[] args) {
		
		double num1 = 10.5;
        double num2 = 20.0;
        double num3 = 30.5;
        
        AverageCalculator n = new AverageCalculator();
        n.average(num1, num2, num3);
		

	}

}
