package hello;

public class max {
	
	   void maxvalue(int a,int b){
		  if(a>b) {
			  System.out.println(a);
		  }else {
			  System.out.println(b);
		  }
		
	}

	public static void main(String[] args) {
		
		max m = new max();
		m.maxvalue(30,10);

	}

} 
