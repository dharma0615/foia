package basics1;

import java.util.Arrays;

public class StringClass {
	
	static int a=10;
	
	public void mdr() {
		System.out.println("Non static method");
	}
	
	public StringClass() {
		System.out.println("Constrcutor block");
	}
	static {
		System.out.println("Static block2");
		
	}
	static {
		System.out.println("Static block");
		
	}
	
	{
		System.out.println("Non static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
String name="Dharma";
System.out.println(name.substring(2, 4));
System.out.println(name.indexOf('r'));

String n="Da08hrma^Marada^rao";
String[] wrd=n.split("\\^");
System.out.println(Arrays.toString(wrd));

System.out.println(Character.isUpperCase('u'));

System.out.println(n.replaceAll("[^A-Z]", ""));

StringClass sc=new StringClass();
sc.mdr();

	}


}
