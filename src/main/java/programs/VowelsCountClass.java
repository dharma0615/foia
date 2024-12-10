package programs;

public class VowelsCountClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new VowelsCountClass().vowelsCount("hello dha!!rma");
	}
	
	public void vowelsCount(String str) {
		int vCount=0;
		int cCount=0;
		int spaceCount=0;
		char[] chs=str.toCharArray();
		for(int i=0;i<chs.length;i++) {
			if(chs[i]=='a'||chs[i]=='e'||chs[i]=='i'||chs[i]=='o'||chs[i]=='u') {
				vCount++;
			}else if(chs[i]==' ') {
				spaceCount++;

		}else if(chs[i]>='a' && chs[i]<='z') {
			cCount++;
			}
		}
		System.out.println(vCount+"==="+cCount+"==="+spaceCount);
		
		
	}

}
