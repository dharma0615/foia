package programs;

public class CharCountClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new CharCountClass().CharCount("Dahrma Rao");
	}
	
	public void CharCount(String str) {
		char[] charCount=str.toCharArray();
		System.out.println("Char Method"+ charCount.length);
		System.out.println("String Method"+str.length());
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("char count w/o spaces: "+count);
	}
	

}
