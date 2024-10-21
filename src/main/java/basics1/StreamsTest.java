package basics1;

import java.util.Scanner;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.printf("My roll number %d, My name is %s, Percentage is %d%% \n", 415, "Dharmarao", 80);
System.out.print("Hello");


Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
String str=sc.next();
System.out.println(a+str);
sc.close();

Scanner sc2=new Scanner("10,20,30");
sc2.useDelimiter(",");
while (sc2.hasNext()) {
	System.out.println(sc2.next());
}



	}

}
