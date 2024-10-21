package basics1;

public class StatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;;) {
			if(i<10) {
				System.out.println(i);
				i++;
			}else {
				break;
			}
				
		}
		
		String friuts[]= {"banana","apple","guva"};
		for(String frt:friuts) {
			System.out.println(frt);
		}

	}

}
