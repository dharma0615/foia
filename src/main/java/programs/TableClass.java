package programs;

public class TableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableClass().printTable(10);
	}

	public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + n * i);
		}
	}

}
