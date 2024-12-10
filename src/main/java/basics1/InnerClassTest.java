package basics1;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("InnerClassTest");

testclass2 tc4=new InnerClassTest().new testclass2();

System.out.println(tc4.b);

	}
	
	public class testclass2{
		int b=20;
		public static void main(String[] args) {
			System.out.println("InnerClassTest2");
			
		}
	}
	
	public static class testclass3{
		
		public static void main(String[] args) {
			System.out.println("InnerClassTest3");
		}
	}


}

 class testclass4{
	 int a=10;
	public static void main(String[] args) {
		System.out.println("InnerClassTest4");
	}
	
	
}
