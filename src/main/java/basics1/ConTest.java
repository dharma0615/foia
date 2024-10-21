package basics1;

public class ConTest {
	
	int i;
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConTest ct=new ConTest();
		System.out.println(ct.i);
		System.out.println(ct.name);
		
	}
	
	 ConTest() {
		// TODO Auto-generated constructor stub

		 this("Dharma");
		 i=20;
	}
	 
	 ConTest(String fname){
name=fname;

}
	 ConTest(String fname, String lname){
name=fname;

}
}
