package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOccrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new FindOccrences().findOccrencesCountUsingMap("Dharma");
	}
	
	public void findOccrencesCountUsingMap(String str) {
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), (map.get(str.charAt(i))+1));
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		for(Entry<Character,Integer> count:map.entrySet()) {
			System.out.println(count.getKey()+"=="+count.getValue());
		}
		
	}

}
