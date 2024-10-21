package basics1;

public class VariablesTest {
	static int currentBalance=15000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VariablesTest vt=new VariablesTest();
vt.deposit(5000);
withdraw(2500);
		
	}
	
	public void deposit(int deposit) {
currentBalance=currentBalance+deposit;
System.out.println(currentBalance);

}
	public static void withdraw(int withdraw) {
		currentBalance=currentBalance-withdraw;
		System.out.println(currentBalance);
	}
	
	
}
