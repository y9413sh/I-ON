package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("±æµ¿", new Integer(90));
		map.put("µ¿±æ", new Integer(900));
		map.put("È«µ¿", new Integer(100));
		map.put("È«±æ", new Integer(24));
		map.put("µ¿È«", new Integer(46));
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println("name : " + e.getKey() + ", score : " + e.getValue());
		}
		
		Set set =map.keySet();
		System.out.println("Âü°¡ÀÚ ¸í´Ü : " + set);
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i;
		}
		
		System.out.println("total : " + total);
		System.out.println("avg : " + (float)(total / set.size()));
		System.out.println("max score : " + Collections.max(values));
		System.out.println("min score : " + Collections.min(values));
	}
}