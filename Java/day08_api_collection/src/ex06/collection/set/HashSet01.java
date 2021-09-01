package ex06.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		hs.add("키보드");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(222);
		hs2.add(1000);
		
		it=hs2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
