package basics1;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		new ArrayTest("Dharma");
		// TODO Auto-generated method stub
		
		

		int i[] = new int[2];
		i[0] = 10;
		i[1] = 20;
		System.out.println(i.length);

		int[] j = new int[] { 100, 200, 300 };
		for (int k = 0; k < j.length; k++) {
			System.out.println(j[k]);
		}

		int[] k = { 400, 500 };

		int mergeArray[] = new int[j.length + k.length];
		System.arraycopy(j, 0, mergeArray, 0, j.length);
		System.arraycopy(k,  0, mergeArray, j.length, k.length);
		for (int num : mergeArray) {
			System.out.println("numbers: "+num);
		}
		System.out.println("=================");
		
		for(int a=0;a<j.length;a++) {
			mergeArray[a]=j[a];
		}
		System.out.println(mergeArray.length);
		
		for(int b=0;b<k.length;b++) {
			mergeArray[j.length+b]=k[b];
			System.out.println(mergeArray.length);
		}
		for (int num1 : mergeArray) {
			System.out.println("numbers: "+num1);
		}
		
		arrayCopy();
	}
	
	 private ArrayTest() {
		
	}
	 
	 private ArrayTest(String name) {
			System.out.println(name);
		}
	
	public static void arrayCopy() {
		int i[]= {10, 20, 30};
		int[] j=new int[] {40,50};
		
		int[] m=new int[i.length+j.length];
		System.arraycopy(i, 0, m, 0,i.length );
		System.arraycopy(j, 0, m, i.length, j.length);
		System.out.println(Arrays.toString(m));
		for(int k:m) {
			System.out.println(k);
		}
		
		
	}

}
