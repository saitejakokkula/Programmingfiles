package hii;

public class Test1 {

	long getphonenumber(String name) {
		
		String[] names = {"Teja","akshita","madhiva","vishnu"};
		long[] phno = {0l,123456789l,987654321l,147258369l};
		int index = 0;
		for(int i=0;i<=names.length-1;i++) {
			if(name.equals(names[i])) {
				System.out.println("index---"+i); 
				index = i;
			}
				
		}
		return phno[index];
		
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		long x = t.getphonenumber("sai");
		System.out.println(x);

	}

}
