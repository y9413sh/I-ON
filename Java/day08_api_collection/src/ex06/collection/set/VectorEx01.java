package ex06.collection.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		System.out.println("length \t / \t capacity");
		System.out.println(v.size() + " \t / \t " + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4); // 초기용량, 증가용량
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(2);
		v2.add(2);
		v2.add(2);
		v2.add(2);
		v2.add(2);
		v2.add(2);
		
		
		System.out.println(v2.size() + " \t / \t " + v2.capacity());
		
		System.out.println();
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		for(int i=0; i<v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println();
		Collections.sort(v2);
		
		for(int i=0; i<v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num);
		}
		
		System.out.println();
		v2.trimToSize(); // capacity 조정
		System.out.println(v2.size() + " \t / \t " + v2.capacity());
	}
}
