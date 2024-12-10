package basics1;

public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer.Inner obj=new Outer.Inner();
		
		obj.msg1();
		System.out.println(obj.a);

	}
	
	 class Inner2 {
		static String staticMessage = "Hello from Outer Class!";
    	int a=10;
        void msg1() {
            System.out.println("msg1 Accessing: " + staticMessage);
        }
        
        static void msg2() {
            System.out.println("Msg2 Accessing: " + staticMessage);
        }
    }
}


class Outer {
    static String staticMessage = "Hello from Outer Class!";

    static class Inner {
    	int a=10;
        void msg1() {
            System.out.println("msg1 Accessing: " + staticMessage);
        }
        
        static void msg2() {
            System.out.println("Msg2 Accessing: " + staticMessage);
        }
    }
}

