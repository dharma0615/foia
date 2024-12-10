package basics1;

public class MainClass {
	static int iA;
	static int iB=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new MainClass().new A();
		a.methodA();
		System.out.println(iA);
		
		new MainClass.B().methodB();;
	}
	
	class A{
		
		public void methodA() {
			int a=100;
			iA=a;
			System.out.println("method A");
		}
		
	}
	
	static class B{
		public void methodB() {
			System.out.println("method B");
		}
		
	}

}
