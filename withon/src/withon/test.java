package withon;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> linkedMap = new LinkedHashMap<String, String>();
		
		map.put("key0", "1");
		map.put("key1", "2");
		map.put("key2", "3");
		map.put("key3", "4");
		map.put("key4", "5");
		map.put("key5", "6");
		map.put("key6", "7");
		map.put("key7", "8");
		map.put("key8", "9");
		map.put("key9", "10");
		
		
		linkedMap.put("key0", "1");
		linkedMap.put("key1", "2");
		linkedMap.put("key2", "3");
		linkedMap.put("key3", "4");
		linkedMap.put("key4", "5");
		linkedMap.put("key5", "6");
		linkedMap.put("key6", "7");
		linkedMap.put("key7", "8");
		linkedMap.put("key8", "9");
		linkedMap.put("key9", "10");
		
		Set<String> set = map.keySet();
		Set<String> linkedSet = linkedMap.keySet();
		
		Iterator<String> iter = set.iterator();
		Iterator<String> linkedIter = linkedSet.iterator();
		
		System.out.println("[HashMap]");
		
		for(int i = 0; i < 10 ; i++){
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println("\n");
		
		System.out.println("[LinkedHashMap]");
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(linkedMap.get(linkedIter.next()));
		}
	}

}
